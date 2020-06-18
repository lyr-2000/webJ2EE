package com.much.shopmanager.service.impl;

import com.much.shopmanager.entity.Sku;
import com.much.shopmanager.dao.SkuDao;
import com.much.shopmanager.entity.SkuBO;
import com.much.shopmanager.entity.Spu;
import com.much.shopmanager.service.SkuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (Sku)表服务实现类
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@Slf4j
@Service("skuService")
public class SkuServiceImpl implements SkuService {
    @Resource
    private SkuDao skuDao;

    /**
     * 插入一条数据
     *
     * @param skuBO
     * @return
     */
    @Override
    public Sku insertOrUpdate(SkuBO skuBO) {
        Sku sku = skuBO.getSku();
        Spu spu = skuBO.getSpu();
        sku.setSpuId(spu.getId());
        sku.setCreateTime(new Date());
        sku.setLastUpdateTime(new Date());
        skuDao.insert(sku);
        return sku;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Sku queryById(Integer id) {
        return this.skuDao.queryById(id);
    }

    /**
     * 首页展示
     * @param spuId
     * @return
     */
    @Override
    public List<Sku> findSkuShowList(Integer spuId) {
        List<Sku> list =  this.skuDao.queryAllBySpuId(spuId);
        log.info("list ->{}",list) ;
        return list;

    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Sku> queryAllByLimit(int offset, int limit) {
        return this.skuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    @Override
    public Sku insert(Sku sku) {
        sku.setCreateTime(new Date());
        sku.setLastUpdateTime(new Date());
        this.skuDao.insert(sku);
        return sku;
    }

    /**
     * 修改数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    @Override
    public Sku update(Sku sku) {
        // sku.setCreateTime(new Date());
        sku.setLastUpdateTime(new Date());
        this.skuDao.update(sku);
        return this.queryById(sku.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.skuDao.deleteById(id) > 0;
    }
}