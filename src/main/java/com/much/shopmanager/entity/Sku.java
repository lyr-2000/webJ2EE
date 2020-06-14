package com.much.shopmanager.entity;

import java.util.Date;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * (Sku)实体类
 *
 * @author makejava
 * @since 2020-06-09 00:17:50
 */
@Data
public class Sku implements Serializable {
    private static final long serialVersionUID = -43837667035965782L;
    
    private Integer id;
    
    private Integer spuId;
    
    private String title;
    
    private String image;
    
    private Double price;
    
    private JSONObject param;
    
    private String saleable;
    
    private Integer valid;
    
    private Date createTime;
    
    private Date lastUpdateTime;
    
    private Integer isDeleted;




}