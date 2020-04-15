package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonPage;
import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @Value("${token.schema}")
    private String schema;

    @GetMapping("/list")
    @ResponseBody
    public CommonResult ListGet(@RequestParam("pageNum") Integer pageNum,
                                @RequestParam("pageSize") Integer pageSize,
                                @RequestParam(value = "keyword",required = false) String keyword){
        CommonPage roleInfo=roleService.selectRoleList(pageNum,pageSize,keyword);
        return CommonResult.success(roleInfo);
    }

    @GetMapping("/listAll")
    @ResponseBody
    public CommonResult ListAllGet(){
        List<CommonPage> roles=roleService.selectAllRoles();
        return CommonResult.success(roles);
    }

}
