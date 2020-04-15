package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.annotation.LoggerAnnotation;
import club.banyuan.cqmall.common.CommonPage;
import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.UmsMenu;
import club.banyuan.cqmall.dao.entity.UmsRole;
import club.banyuan.cqmall.dto.AdminLoginParam;
import club.banyuan.cqmall.dto.UmsRoleDto;
import club.banyuan.cqmall.service.AdminService;
import club.banyuan.cqmall.vo.AdminInfo;
import club.banyuan.cqmall.vo.LoginToken;
import org.apache.ibatis.annotations.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @Value("${token.schema}")
    private String schema;

    @LoggerAnnotation
    @PostMapping("/login")
    @ResponseBody
    public CommonResult loginPost(@RequestBody AdminLoginParam adminLoginParam) {
        String token = adminService.login(adminLoginParam.getUsername(), adminLoginParam.getPassword());
        LoginToken loginToken = new LoginToken(schema, token);
        return CommonResult.success(loginToken);
    }

    @GetMapping("/info")
    @ResponseBody
    public CommonResult infoGet(Principal principal) {
        principal.getName();
        AdminInfo adminInfo = adminService.selectAdminInfo(principal.getName());
        return CommonResult.success(adminInfo);
    }

    @GetMapping("/list")
    @ResponseBody
    public CommonResult ListGet(@RequestParam("pageNum") Integer pageNum,
                                @RequestParam("pageSize") Integer pageSize,
                                @RequestParam(value = "keyword", required = false) String keyword) {
        CommonPage adminInfo = adminService.selectAdminList(pageNum, pageSize, keyword);
        return CommonResult.success(adminInfo);
    }

    @GetMapping("/role/{adminId}")
    @ResponseBody
    public CommonResult RolesGet(@PathVariable("adminId") Long adminId) {
        List<UmsRoleDto> roles = adminService.selectRolesByAdminId(adminId);
        return CommonResult.success(roles);
    }

    @PostMapping("/delete/{id}")
    @ResponseBody
    public CommonResult deleteAdmin(@PathVariable("id") Long id) {
        adminService.deleteAdminById(id);
        return CommonResult.success();
    }

    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult updateAdmin(@PathVariable("id") Long adminId) {
        List<UmsRoleDto> roles = adminService.selectRolesByAdminId(adminId);
        return CommonResult.success(roles);
    }

    @PostMapping("/register")
    @ResponseBody
    public CommonResult registerAdmin(@PathVariable("adminId") Long adminId) {
        List<UmsRoleDto> roles = adminService.selectRolesByAdminId(adminId);
        return CommonResult.success(roles);
    }

}
