package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.UmsMemberLevel;
import club.banyuan.cqmall.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/memberLevel")
public class MemberLevelController {

    @Autowired
    MemberLevelService memberLevelService;

    @GetMapping("/list")
    @ResponseBody
    public CommonResult memberLevelList(@RequestParam(value = "defaultStatus", required = false) Integer defaultStatus) {
        List<UmsMemberLevel> umsMemberLevels = memberLevelService.selectListByDefaultStatus(defaultStatus);
        return CommonResult.success(umsMemberLevels);
    }

}
