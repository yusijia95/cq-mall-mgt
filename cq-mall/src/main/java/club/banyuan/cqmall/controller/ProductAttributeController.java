package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.PmsBrand;
import club.banyuan.cqmall.dao.entity.PmsProductAttribute;
import club.banyuan.cqmall.dto.PmsBrandDto;
import club.banyuan.cqmall.service.BrandService;
import club.banyuan.cqmall.service.ProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/productAttribute")
public class ProductAttributeController {

    @Autowired
    ProductAttributeService productAttributeService;

    @GetMapping("/list/{cid}")
    @ResponseBody
    public CommonResult listProductAttribute(@PathVariable Long cid,
                                  @RequestParam(value = "type", required = false) Integer type,
                                  @RequestParam(value = "pageNum") Integer pageNum,
                                  @RequestParam(value = "pageSize") Integer pageSize) {
        List<PmsProductAttribute> pmsProductAttributes = productAttributeService.selectProductAttributeListByType(type);
        return CommonResult.setPage(pageNum, pageSize, pmsProductAttributes);
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
