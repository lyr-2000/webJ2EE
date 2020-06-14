package com.much.shopmanager.controller;

import com.much.shopmanager.entity.Brand;
import com.much.shopmanager.service.BrandService;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Brand)表控制层
 * <p>
 *     业务信息： 商品品牌管理
 * </p>
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@RestController
@CrossOrigin
public class BrandController {
    /**
     * 服务对象
     */
    @Resource
    private BrandService brandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/brand/{id}")
    public Brand selectOne( @PathVariable Integer id) {
        return this.brandService.queryById(id);
    }


    /**
     * 分页查询品牌形象
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/brand/all")
    public List<Brand> getAllBrand(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "5") Integer size) {
        Assert.isTrue(page>0&& size>1,"分页条件不对");
        return brandService.queryAllByLimit((page-1)*size,size);
    }

    @GetMapping("/brand/all/_count")
    public Long getTotalNum() {
        return brandService.countAll();
    }
    @GetMapping("/brand")
    public List<Brand> selectListLikeName(@RequestParam Integer page,
                                          @RequestParam Integer size,
                                          @RequestParam String name,
                                          @RequestParam String letter) {
        Assert.isTrue(page>0&&size>1,"参数不正确");
        return brandService.searchLike(name,letter,(page-1)*size,size);
    }

    /**
     * 添加品牌
     * @param brand
     * @return
     */
    @PostMapping("/brand")
    public Brand addAnNewBrand(@RequestBody Brand brand) {
        return brandService.insert(brand);
    }


    /**
     * 更新对应品牌
     * @param brand
     * @return
     */
    @PutMapping("/brand")
    public Brand updateBrandInfo(@RequestBody Brand brand) {
        return brandService.update(brand);
    }

}