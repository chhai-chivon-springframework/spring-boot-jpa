package com.wordpress.chhaichivon.web;

import com.wordpress.chhaichivon.domain.User;
import com.wordpress.chhaichivon.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/25/2017
 * TIME   : 10:25 AM
 */
@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    private Map<String,Object> map;

    @RequestMapping(value = "/users",method = RequestMethod.GET,headers = "Accept=Application/json")
    public ResponseEntity<Map<String,Object>> gets() {
        map = new HashMap<>();
        List<User> users = (List<User>) userRepository.findAll();
            if(users != null || !users.isEmpty()){
                map.put("DATA", users);
                map.put("STATUS", true);
                map.put("MESSAGE", "DATA FOUND");
            }else{
                map.put("STATUS", false);
                map.put("MESSAGE", "DATA NOT FOUND");
            }
        return new ResponseEntity(map, HttpStatus.OK);
    }
    @RequestMapping(value = "/users", method = RequestMethod.POST,headers = "Accept=Application/json")
    public ResponseEntity<Map<String,Object>> save(@RequestBody User userSave) {
       User user =  userRepository.save(userSave);
        if(user != null){
            map.put("DATA", user);
            map.put("STATUS", true);
            map.put("MESSAGE", "SUCCESSFUL");
        }else{
            map.put("STATUS", false);
            map.put("MESSAGE", "FAIL");
        }
        return new ResponseEntity(map, HttpStatus.OK);
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.POST,headers = "Accept=Application/json")
    public ResponseEntity<Map<String,Object>> delete(@PathVariable("id") Long id) {
        User user =  userRepository.findOne(id);
        if(user != null){
            userRepository.delete(user);
            map.put("DATA", user);
            map.put("STATUS", true);
            map.put("MESSAGE", "SUCCESSFUL");
        }else{
            map.put("STATUS", false);
            map.put("MESSAGE", "DATA NOT FOUND");
        }
        return new ResponseEntity(map, HttpStatus.OK);
    }
}
