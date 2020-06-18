package com.much.shopmanager.service;

import com.much.shopmanager.entity.Sku;
import com.much.shopmanager.entity.SkuBO;
import com.much.shopmanager.entity.Spu;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * (Spu)表服务接口
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
public interface SpuService {

    Spu insertOrUpdate(  String brand,
                         String category,
                         String spuProductName);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Spu queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Spu> queryAllByLimit(int offset, int limit);
    List<Spu> queryByExample(Spu example);
    List<Spu> queryByFuzzyName(String brandName,String categoryName,String title,Integer page,Integer size);

    // List<Spu> queryByFuzzyName(String brandName, String categoryName, String title, Integer page, Integer size);

    Long countByName(String brandName, String categoryName, String title);

    List<Spu> queryByExample(Spu example, Integer page, Integer size);

    Long countByExample(Spu example);

    List<Spu> queryShowSpu(int offset, int limit);

    /**
     * 所有记录数量
     * @return
     */
    Long countTotalRecord();

    /**
     * 新增数据
     *
     * @param spu 实例对象
     * @return 实例对象
     */
    Spu insert(Spu spu);

    /**
     * 修改数据
     *
     * @param spu 实例对象
     * @return 实例对象
     */
    Spu update(Spu spu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}