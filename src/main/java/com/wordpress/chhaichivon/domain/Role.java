package com.wordpress.chhaichivon.domain;

import com.wordpress.chhaichivon.helpers.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/25/2017
 * TIME   : 10:32 AM
 */
@Data
@Entity
@Table(name = "tb_role")
public class Role extends BaseEntity{
    @Column(name = "role_name")
    private String name;
    @Column(name = "description")
    private String description;
}
