package com.wordpress.chhaichivon.repository.user;

import com.wordpress.chhaichivon.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/25/2017
 * TIME   : 10:22 AM
 */
public interface UserRepository extends CrudRepository<User, Long>{
    User findByUserName(String username);

/*
    @Override
    User findOne(Long aLong);

    @Override
    Iterable<User> findAll();

    @Override
    long count();

    @Override
    void delete(User user);*/
}
