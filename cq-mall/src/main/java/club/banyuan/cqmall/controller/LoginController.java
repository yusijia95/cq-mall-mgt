package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.annotation.LoggerAnnotation;
import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dto.AdminLoginParam;
import club.banyuan.cqmall.service.AdminService;
import club.banyuan.cqmall.vo.LoginToken;
import org.apache.ibatis.annotations.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    AdminService adminService;

    @Value("${token.schema}")
    private String schema;

    @LoggerAnnotation
    @PostMapping("/login")
    @ResponseBody
    public CommonResult loginPost(@RequestBody AdminLoginParam adminLoginParam){
        String token=adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword());
        LoginToken loginToken=new LoginToken(schema,token);
        return CommonResult.success(loginToken);
    }

}
