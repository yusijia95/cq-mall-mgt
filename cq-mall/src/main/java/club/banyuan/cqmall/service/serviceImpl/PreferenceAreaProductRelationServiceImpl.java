package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.CmsPrefrenceAreaProductRelationDao;
import club.banyuan.cqmall.dao.entity.CmsPrefrenceAreaProductRelation;
import club.banyuan.cqmall.service.PreferenceAreaProductRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceAreaProductRelationServiceImpl implements PreferenceAreaProductRelationService {

    @Autowired
    CmsPrefrenceAreaProductRelationDao cmsPrefrenceAreaProductRelationDao;

    @Override
    public Integer insertPreferenceAreaProductRelation(List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        return cmsPrefrenceAreaProductRelationDao.insertList(prefrenceAreaProductRelationList);
    }
}
