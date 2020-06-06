package com.much.shopmanager.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Spu)实体类
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getSpgId() {
        return spgId;
    }

    public void setSpgId(Integer spgId) {
        this.spgId = spgId;
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