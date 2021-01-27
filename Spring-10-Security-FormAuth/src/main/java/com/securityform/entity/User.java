package com.securityform.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter

public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean active;
    private String firstName;
    private String lastName;
    private String roles;
    private String permissions;

    @Autowired
    public User(String username, String password,String firstName, String lastName, String roles, String permissions) {
        this.username = username;
        this.password = password;
        this.active = true;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
        this.permissions = permissions;
    }

    public List<String> getRoleList(){
        if(this.roles.length()>0){
            return Arrays.asList(roles.split(","));
        }
        return new ArrayList<>();
    }


    public List<String> getPermissionList(){
        if(this.permissions.length()>0){
            return Arrays.asList(permissions.split(","));
        }
        return new ArrayList<>();
    }
}
