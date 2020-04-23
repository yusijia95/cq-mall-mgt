package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.service.ResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/resourceCategory")
public class ResourceCategoryController {

    @Autowired
    ResourceCategoryService resourceCategoryService;

    @GetMapping("/listAll")
    @ResponseBody
    public CommonResult listAllGet(){
        return CommonResult.success(resourceCategoryService.selectAllResourceCategory());
    }


}
