package com.much.shopmanager.service;

import com.much.shopmanager.entity.SpecParam;
import java.util.List;

/**
 * (SpecParam)表服务接口
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
public interface SpecParamService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SpecParam queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SpecParam> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param specParam 实例对象
     * @return 实例对象
     */
    SpecParam insert(SpecParam specParam);

    /**
     * 修改数据
     *
     * @param specParam 实例对象
     * @return 实例对象
     */
    SpecParam update(SpecParam specParam);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}