package com.wordpress.chhaichivon.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordpress.chhaichivon.helpers.BaseEntity;
import lombok.Data;


import javax.persistence.*;
import java.util.Set;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/25/2017
 * TIME   : 10:17 AM
 */
@Data
@Entity
@Table(name = "tb_user")
public class User extends BaseEntity {
   /* public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();*/

    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_name")
    @JsonProperty("USERNAME")
    private String userName;
    @JsonProperty("PASSWORD")
    @Column(name = "password")
    private String password;
  /*  @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;*/

    /*public void setPassword(String password) {
        this.password = PASSWORD_ENCODER.encode(password);
    }*/
}
