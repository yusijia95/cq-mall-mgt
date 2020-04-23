package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.PmsBrand;
import club.banyuan.cqmall.dto.PmsBrandDto;
import club.banyuan.cqmall.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    BrandService brandService;

    @GetMapping("/list")
    @ResponseBody
    public CommonResult listBrand(@RequestParam(value = "pageNum" ) Integer pageNum,
                                  @RequestParam(value = "pageSize") Integer pageSize,
                                  @RequestParam(value = "keyword" ,required = false) String keyword){
        List<PmsBrand> brands=brandService.selectBrandList(keyword);
        return CommonResult.setPage(pageNum,pageSize,brands);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult brandGet(@PathVariable Long id){
        PmsBrand brand=brandService.selectBrandById(id);
        return CommonResult.success(brand);
    }

    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult updateBrand(@RequestBody PmsBrandDto pmsBrandDto,
                                    @PathVariable Long id){
        brandService.updateBrandById(pmsBrandDto);
        return CommonResult.success();
    }

    @PostMapping("/create")
    @ResponseBody
    public CommonResult createBrand(@RequestBody PmsBrandDto pmsBrandDto){
        brandService.createBrand(pmsBrandDto);
        return CommonResult.success();
    }

}
