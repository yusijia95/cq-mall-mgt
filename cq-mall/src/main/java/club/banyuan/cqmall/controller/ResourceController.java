package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonPage;
import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.UmsResource;
import club.banyuan.cqmall.service.MenuService;
import club.banyuan.cqmall.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public CommonResult ListGet(@RequestParam("pageNum") Optional<Integer> pageNum,
                                @RequestParam("pageSize") Optional<Integer> pageSize,
                                @RequestParam("nameKeyword") Optional<String> nameKeyword,
                                @RequestParam("urlKeyword") Optional<String> urlKeyword,
                                @RequestParam("categoryId") Optional<Long> categoryId){
        List<UmsResource> resources=resourceService.selectResourceList(nameKeyword.orElse(null),urlKeyword.orElse(null),categoryId.orElse(-1L));
        return CommonResult.setPage(pageNum.orElse(0),pageSize.orElse(5),resources);
    }

}
