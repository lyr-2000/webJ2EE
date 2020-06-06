package com.much.shopmanager.service.impl;

import com.much.shopmanager.entity.SpecParam;
import com.much.shopmanager.dao.SpecParamDao;
import com.much.shopmanager.service.SpecParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SpecParam)表服务实现类
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@Service("specParamService")
public class SpecParamServiceImpl implements SpecParamService {
    @Resource
    private SpecParamDao specParamDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SpecParam queryById(Integer id) {
        return this.specParamDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SpecParam> queryAllByLimit(int offset, int limit) {
        return this.specParamDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param specParam 实例对象
     * @return 实例对象
     */
    @Override
    public SpecParam insert(SpecParam specParam) {
        this.specParamDao.insert(specParam);
        return specParam;
    }

    /**
     * 修改数据
     *
     * @param specParam 实例对象
     * @return 实例对象
     */
    @Override
    public SpecParam update(SpecParam specParam) {
        this.specParamDao.update(specParam);
        return this.queryById(specParam.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.specParamDao.deleteById(id) > 0;
    }
}