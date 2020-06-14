package com.much.shopmanager.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Brand)实体类
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@Data
public class Brand implements Serializable {
    private static final long serialVersionUID = 728884937278408604L;
    
    private Integer id;
    
    private String name;
    
    private String image;
    
    private String letter;
    
    private String isDeleted;


    //

}