package com.much.shopmanager.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (Category)实体类
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@Data
public class Category implements Serializable {
    private static final long serialVersionUID = 176126512717188227L;
    
    private Integer id;
    
    private String name;
    
    private Integer parentId;
    
    private Integer isParent;
    
    private Integer sort;
    
    private Integer isDeleted;
    // /**
    //  * 下一级分类
    //  */
    // private List<Category> childs;


    // public Integer getId() {
    //     return id;
    // }
    //
    // public void setId(Integer id) {
    //     this.id = id;
    // }
    //
    // public String getName() {
    //     return name;
    // }
    //
    // public void setName(String name) {
    //     this.name = name;
    // }
    //
    // public Integer getParentId() {
    //     return parentId;
    // }
    //
    // public void setParentId(Integer parentId) {
    //     this.parentId = parentId;
    // }
    //
    // public Integer getIsParent() {
    //     return isParent;
    // }
    //
    // public void setIsParent(Integer isParent) {
    //     this.isParent = isParent;
    // }
    //
    // public Integer getSort() {
    //     return sort;
    // }
    //
    // public void setSort(Integer sort) {
    //     this.sort = sort;
    // }
    //
    // public Integer getIsDeleted() {
    //     return isDeleted;
    // }
    //
    // public void setIsDeleted(Integer isDeleted) {
    //     this.isDeleted = isDeleted;
    // }

}