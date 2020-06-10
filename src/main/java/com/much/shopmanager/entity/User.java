package com.much.shopmanager.entity;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-06-09 00:47:01
 */
public class User implements Serializable {
    private static final long serialVersionUID = 676864552627803037L;
    @NotBlank
    private String name;
    @NotBlank
    private String password;
    
    private String salt;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

}