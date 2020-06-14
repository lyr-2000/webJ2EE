package com.much.shopmanager.dao;

import com.much.shopmanager.entity.Sku;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Sku)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-09 00:17:02
 */
public interface SkuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Sku queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Sku> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Sku> queryAllBySpuId(@Param("spuId") Integer spuId);
    /**
     * 通过实体作为筛选条件查询
     *
     * @param sku 实例对象
     * @return 对象列表
     */
    List<Sku> queryAll(Sku sku);

    /**
     * 新增数据
     *
     * @param sku 实例对象
     * @return 影响行数
     */
    int insert(Sku sku);

    /**
     * 修改数据
     *
     * @param sku 实例对象
     * @return 影响行数
     */
    int update(Sku sku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}