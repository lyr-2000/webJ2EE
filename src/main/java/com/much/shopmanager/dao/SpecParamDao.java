package com.much.shopmanager.dao;

import com.much.shopmanager.entity.SpecParam;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SpecParam)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
public interface SpecParamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SpecParam queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SpecParam> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param specParam 实例对象
     * @return 对象列表
     */
    List<SpecParam> queryAll(SpecParam specParam);

    /**
     * 新增数据
     *
     * @param specParam 实例对象
     * @return 影响行数
     */
    int insert(SpecParam specParam);

    /**
     * 修改数据
     *
     * @param specParam 实例对象
     * @return 影响行数
     */
    int update(SpecParam specParam);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}