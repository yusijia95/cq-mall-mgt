package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.PmsProductAttribute;
import club.banyuan.cqmall.dao.entity.PmsProductCategory;
import club.banyuan.cqmall.service.ProductAttributeService;
import club.banyuan.cqmall.service.ProductCategoryService;
import club.banyuan.cqmall.vo.ProductCategoryWithChildren;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/productCategory")
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;

    @GetMapping("/list/{parentId}")
    @ResponseBody
    public CommonResult listProductCategory(@PathVariable Long parentId,
                                            @RequestParam(value = "pageNum") Integer pageNum,
                                            @RequestParam(value = "pageSize") Integer pageSize) {
        List<PmsProductCategory> pmsProductCategories = productCategoryService.selectProductCategoryListByParentId(parentId);
        return CommonResult.setPage(pageNum, pageSize, pmsProductCategories);
    }

    @GetMapping("/list/withChildren")
    @ResponseBody
    public CommonResult listProductCategoryWithChildren() {
        List<ProductCategoryWithChildren> list=productCategoryService.selectProductAttributeList();
        return CommonResult.success(list);
    }

//    @PostMapping("/update/{id}")
//    @ResponseBody
//    public CommonResult updateBrand(@RequestBody PmsBrandDto pmsBrandDto,
//                                    @PathVariable Long id){
//        brandService.updateBrandById(pmsBrandDto);
//        return CommonResult.success();
//    }
//
//    @PostMapping("/create")
//    @ResponseBody
//    public CommonResult createBrand(@RequestBody PmsBrandDto pmsBrandDto){
//        brandService.createBrand(pmsBrandDto);
//        return CommonResult.success();
//    }

}
