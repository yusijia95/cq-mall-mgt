package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.UmsMenu;
import club.banyuan.cqmall.service.AdminService;
import club.banyuan.cqmall.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class HomeController {

    @Autowired
    MenuService menuService;

    @Autowired
    AdminService adminService;

    @GetMapping("/info")
    @ResponseBody
    public CommonResult HomePageGet(){
        List<UmsMenu> umsMenus = menuService.selectAllMenu();
        adminService.selectByUsername()

        return CommonResult.success();
    }

}
