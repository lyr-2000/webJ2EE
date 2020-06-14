package com.much.shopmanager.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (Spu)实体类
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@Data

public class Spu implements Serializable {
    private static final long serialVersionUID = 155645757466298141L;
    
    private Integer id;
    
    private String title;
    
    private String subTitle;
    
    private Integer categoryId;
    
    private Integer brandId;
    
    private Integer spgId;
    
    private String saleable;
    
    private Integer valid;
    
    private Date createTime;
    
    private Date lastUpdateTime;
    
    private Object isDeleted;

    /**
     * 品牌
     */
    private Brand brand;
    private Category category;




}