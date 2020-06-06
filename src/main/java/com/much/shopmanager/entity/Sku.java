package com.much.shopmanager.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Sku)实体类
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
public class Sku implements Serializable {
    private static final long serialVersionUID = -52820565445381482L;
    
    private Integer id;
    
    private Integer spuId;
    
    private String title;
    
    private String image;
    
    private Double price;
    
    private Object param;
    
    private String saleable;
    
    private Integer valid;
    
    private Date createTime;
    
    private Date lastUpdateTime;
    
    private Object isDeleted;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    public String getSaleable() {
        return saleable;
    }

    public void setSaleable(String saleable) {
        this.saleable = saleable;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Object getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Object isDeleted) {
        this.isDeleted = isDeleted;
    }

}