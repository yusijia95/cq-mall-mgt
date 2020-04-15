package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonPage;
import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.UmsMenu;
import club.banyuan.cqmall.service.MenuService;
import club.banyuan.cqmall.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @Value("${token.schema}")
    private String schema;

    @GetMapping("/list/{parentId}")
    @ResponseBody
    public CommonResult ListGet(@PathVariable("parentId") Long parentId,
                                @RequestParam(value = "pageNum", required = false) Integer pageNum,
                                @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        List<UmsMenu> umsMenus = menuService.selectMenuListByParentId(parentId);
        return CommonResult.setPage(pageNum, pageSize, umsMenus);
    }

}
