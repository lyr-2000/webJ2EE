package com.much.shopmanager.controller;

import com.much.shopmanager.entity.Category;
import com.much.shopmanager.service.CategoryService;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Category)表控制层
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@RestController
@CrossOrigin
public class CategoryController {
    /**
     * 服务对象
     */
    @Resource
    private CategoryService categoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("category/{id}")
    public Category selectOne( @PathVariable Integer id) {
        return this.categoryService.queryById(id);
    }

    // @GetMapping("/category")
    // public List<Category> getPage(@RequestParam Integer page, @RequestParam Integer size) {
    //     Assert.isTrue(page>0 && size>0);
    //     return categoryService.queryAllByLimit(
    //             size*(page-1),
    //             size
    //     );
    // }
    /*
    @GetMapping
    public List<Category> selectByExample() {
        // return categoryService
    }

    */

    /**
     * 更新分类
     * @param category
     * @return
     */
    @PutMapping("/category")
    public Category updateOne(@RequestBody Category category) {
        return categoryService.update(category);
    }

    /**
     * 添加分类
     * @param category
     * @return
     */
    @PostMapping("/category")
    public Category addOne(@RequestBody Category category) {
        return categoryService.insert(category);
    }


    @GetMapping("/category")
    public List<Category> findCategoryList(
            @RequestParam(defaultValue = "1") Integer sort
            ,@RequestParam Integer parentId) {
        // sort = sort and parentId = null or ?
        //sort 表示 n级分类
        Category example = new Category();
        example.setParentId(parentId);
        example.setSort(sort);
        // Long total = categoryService.
        return categoryService.selectByExample(example);

    }


}