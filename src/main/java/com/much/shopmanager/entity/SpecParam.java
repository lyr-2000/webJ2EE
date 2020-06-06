package com.much.shopmanager.entity;

import java.io.Serializable;

/**
 * (SpecParam)实体类
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
public class SpecParam implements Serializable {
    private static final long serialVersionUID = 607276586831472140L;
    
    private Integer id;
    
    private Integer spuGroupId;
    
    private String name;
    
    private String unit;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpuGroupId() {
        return spuGroupId;
    }

    public void setSpuGroupId(Integer spuGroupId) {
        this.spuGroupId = spuGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}