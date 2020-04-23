package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.PmsProductAttribute;
import club.banyuan.cqmall.dao.entity.PmsProductAttributeCategory;
import club.banyuan.cqmall.service.ProductAttributeCategoryService;
import club.banyuan.cqmall.service.ProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/productAttribute/category")
public class ProductAttributeCategoryController {

    @Autowired
    ProductAttributeCategoryService productAttributeCategoryService;

    @GetMapping("/list")
    @ResponseBody
    public CommonResult listProductAttributeCategory(@RequestParam(value = "pageNum") Integer pageNum,
                                  @RequestParam(value = "pageSize") Integer pageSize){
        List<PmsProductAttributeCategory> pmsProductAttributeCategories = productAttributeCategoryService.selectProductAttributeCategoryList();
        return CommonResult.setPage(pageNum,pageSize,pmsProductAttributeCategories);
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
