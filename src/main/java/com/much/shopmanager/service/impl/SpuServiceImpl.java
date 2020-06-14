package com.much.shopmanager.service.impl;

import com.much.shopmanager.entity.Spu;
import com.much.shopmanager.dao.SpuDao;
import com.much.shopmanager.service.SpuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Spu)表服务实现类
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@Service("spuService")
public class SpuServiceImpl implements SpuService {
    @Resource
    private SpuDao spuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Spu queryById(Integer id) {
        return this.spuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Spu> queryAllByLimit(int offset, int limit) {
        return this.spuDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Spu> queryShowSpu(int offset,int limit) {
        return this.spuDao.queryBrandCategoryInfo(offset,limit);
    }


    /**
     * 所有记录数量
     *
     * @return
     */
    @Override
    public Long countTotalRecord() {
        return this.spuDao.countTotalRecord();
    }

    /**
     * 新增数据
     *
     * @param spu 实例对象
     * @return 实例对象
     */
    @Override
    public Spu insert(Spu spu) {
        this.spuDao.insert(spu);
        return spu;
    }

    /**
     * 修改数据
     *
     * @param spu 实例对象
     * @return 实例对象
     */
    @Override
    public Spu update(Spu spu) {
        this.spuDao.update(spu);
        return this.queryById(spu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.spuDao.deleteById(id) > 0;
    }
}