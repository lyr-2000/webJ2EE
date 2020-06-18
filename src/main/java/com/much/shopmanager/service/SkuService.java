package com.much.shopmanager.service;

import com.much.shopmanager.entity.Sku;
import com.much.shopmanager.entity.SkuBO;

import java.util.List;

/**
 * (Sku)表服务接口
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
public interface SkuService {


    /**
     * 插入一条数据
     * @param skuBO
     * @return
     */
    Sku insertOrUpdate(SkuBO skuBO);


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Sku queryById(Integer id);

    List<Sku> findSkuShowList(Integer spuId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Sku> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    Sku insert(Sku sku);

    /**
     * 修改数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    Sku update(Sku sku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}