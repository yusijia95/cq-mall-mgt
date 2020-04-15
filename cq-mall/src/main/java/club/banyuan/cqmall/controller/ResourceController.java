package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonPage;
import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.UmsResource;
import club.banyuan.cqmall.dto.UmsResourceDto;
import club.banyuan.cqmall.service.MenuService;
import club.banyuan.cqmall.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    ResourceService resourceService;

    @Value("${token.schema}")
    private String schema;

    @GetMapping("/list")
    @ResponseBody
    public CommonResult ListGet(@RequestParam("pageNum") Integer pageNum,
                                @RequestParam("pageSize") Integer pageSize,
                                @RequestParam(value = "nameKeyword" ,required = false) String nameKeyword,
                                @RequestParam(value = "urlKeyword" ,required = false) String urlKeyword,
                                @RequestParam(value = "categoryId",required = false) Long categoryId) {
        List<UmsResource> resources = resourceService.selectResourceList(nameKeyword, urlKeyword, categoryId);
        return CommonResult.setPage(pageNum, pageSize, resources);
    }

    @PostMapping("/create")
    @ResponseBody
    public CommonResult createResource(@RequestBody @Valid UmsResourceDto umsResourceDto) {
        resourceService.insertResource(umsResourceDto);
        return CommonResult.success();
    }

    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult updateResource(@RequestBody @Valid UmsResourceDto umsResourceDto) {
        resourceService.updateResource(umsResourceDto);
        return CommonResult.success();
    }

    @PostMapping("/delete/{id}")
    @ResponseBody
    public CommonResult deleteResource(@PathVariable("id") Long id) {
        resourceService.deleteResource(id);
        return CommonResult.success();
    }
}
