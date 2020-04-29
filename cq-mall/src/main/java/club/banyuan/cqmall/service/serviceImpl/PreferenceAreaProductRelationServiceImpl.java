package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.CmsPrefrenceAreaProductRelationDao;
import club.banyuan.cqmall.dao.PmsBrandDao;
import club.banyuan.cqmall.dao.entity.CmsPrefrenceAreaProductRelation;
import club.banyuan.cqmall.service.PreferenceAreaProductRelationService;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceAreaProductRelationServiceImpl implements PreferenceAreaProductRelationService {

    @Autowired
    CmsPrefrenceAreaProductRelationDao cmsPrefrenceAreaProductRelationDao;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Override
    public Integer insertPreferenceAreaProductRelation(List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.SIMPLE, false);
        CmsPrefrenceAreaProductRelationDao mapper = sqlSession.getMapper(CmsPrefrenceAreaProductRelationDao.class);
        return mapper.insertList(prefrenceAreaProductRelationList);
    }
}
