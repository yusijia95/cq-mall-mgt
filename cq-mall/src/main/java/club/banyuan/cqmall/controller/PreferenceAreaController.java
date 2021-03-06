package club.banyuan.cqmall.controller;

import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.dao.entity.CmsPrefrenceArea;
import club.banyuan.cqmall.dao.entity.CmsSubject;
import club.banyuan.cqmall.service.PreferenceAreaService;
import club.banyuan.cqmall.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/prefrenceArea")
public class PreferenceAreaController {

    @Autowired
    PreferenceAreaService preferenceAreaService;

    @GetMapping("/listAll")
    @ResponseBody
    public CommonResult preferenceAreaListAll() {
        List<CmsPrefrenceArea> prefrenceAreas = preferenceAreaService.selectAll();
        return CommonResult.success(prefrenceAreas);
    }

}
