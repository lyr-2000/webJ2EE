package com.much.shopmanager.service.impl;

import com.much.shopmanager.dao.BrandDao;
import com.much.shopmanager.dao.CategoryDao;
import com.much.shopmanager.entity.*;
import com.much.shopmanager.dao.SpuDao;
import com.much.shopmanager.service.SpuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.Instant;
import java.util.Date;
import java.util.List;

/**
 * (Spu)表服务实现类
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@Slf4j
@Service("spuService")
public class SpuServiceImpl implements SpuService {
    @Resource
    private SpuDao spuDao;

    @Resource
    private CategoryDao categoryDao;
    @Resource
    private BrandDao brandDao;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public Spu insertOrUpdate(String brand,
                              String category,
                              String spuProductName) {
        Brand example = new Brand();
        example.setName(brand);
        List<Brand> brands = brandDao.queryAll(example);
        int brandId=-1;
        int categoryId = -1;
        if(brands.isEmpty()) {
            brandDao.insert(example);
            brandId = example.getId();
        }else{
            brandId = brands.get(0).getId();
        }
        log.info("brand 的品牌ID {} ->brand {}",example.getId(),example);
        Category categoryExample = new Category();

        categoryExample.setName(category);
        List<Category> categories = categoryDao.queryAll(categoryExample);
        if(categories.isEmpty()) {
            throw new RuntimeException("对不起，没有当前分离");
            // categoryDao.insert(categoryExample);
            // categoryId = categoryExample.getId();
        }else{
            categoryId = categories.get(0).getId();
        }

        Spu spu = new Spu();

        spu.setCategoryId(categoryId);
        spu.setBrandId(brandId);

        spu.setTitle(spuProductName);
        List<Spu> spus = spuDao.queryAll(spu);
        if(spus.isEmpty()) {
            spu.setLastUpdateTime(new Date());
            spu.setCreateTime(new Date());
            spuDao.insert(spu);
            return spu;
        }else{
            return spus.get(0);
        }
        // return null;
    }

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
    public List<Spu> queryByExample(Spu example) {
        return spuDao.queryAll(example);
    }

    @Override
    public List<Spu> queryByFuzzyName(String brandName, String categoryName, String title, Integer page, Integer size) {
        return this.spuDao.queryfluzzyName(categoryName,title,brandName,size*(page-1),size);

    }
    @Override
    public Long countByName(String brandName, String categoryName, String title) {
        return this.spuDao.queryFluzzyNameCount(categoryName,title,brandName);
    }

    @Override
    public List<Spu> queryByExample(Spu example, Integer page, Integer size) {
        return spuDao.queryByExample(example,(page-1)*size,size);
    }
    @Override
    public Long countByExample(Spu example) {
        return spuDao.countByExample(example);
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
        spu.setLastUpdateTime(new Date());
        spu.setCreateTime(new Date());
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

        spu.setLastUpdateTime(new Date());
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