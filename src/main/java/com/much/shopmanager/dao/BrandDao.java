package com.much.shopmanager.dao;

import com.much.shopmanager.entity.Brand;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Brand)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
public interface BrandDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Brand queryById(Integer id);
    Long countAll();


    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Brand> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
    List<Brand> searchNameAndLetter(@Param("name") String name,@Param("letter") String letter
            ,@Param("skip") Integer skip,@Param("size") Integer size);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param brand 实例对象
     * @return 对象列表
     */
    List<Brand> queryAll(Brand brand);

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 影响行数
     */
    int insert(Brand brand);

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 影响行数
     */
    int update(Brand brand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}