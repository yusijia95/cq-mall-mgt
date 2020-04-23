package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.PmsProduct;
import club.banyuan.cqmall.dto.CreateProductDto;
import club.banyuan.cqmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/create")
    @ResponseBody
    public CommonResult createProduct(@RequestBody CreateProductDto productDto) {
        productService.insertProduct(productDto);
        return CommonResult.success();
    }

    @GetMapping("/list")
    @ResponseBody
    public CommonResult listProduct(@RequestParam(value = "publishStatus", required = false) Integer publishStatus,
                                    @RequestParam(value = "verifyStatus", required = false) Integer verifyStatus,
                                    @RequestParam(value = "keyword", required = false) String keyword,
                                    @RequestParam(value = "productSn", required = false) String productSn,
                                    @RequestParam(value = "productCategoryId", required = false) Long productCategoryId,
                                    @RequestParam(value = "brandId", required = false) Long brandId,
                                    @RequestParam(value = "pageNum") Integer pageNum,
                                    @RequestParam(value = "pageSize") Integer pageSize) {
        List<PmsProduct> pmsProducts = productService.selectProducts(publishStatus,verifyStatus,keyword,productSn,productCategoryId,brandId);
        return CommonResult.setPage(pageNum, pageSize, pmsProducts);
    }


}
