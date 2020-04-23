package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.CmsSubjectProductRelationDao;
import club.banyuan.cqmall.dao.entity.CmsSubjectProductRelation;
import club.banyuan.cqmall.service.SubjectProductRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectProductRelationServiceImpl implements SubjectProductRelationService {

    @Autowired
    CmsSubjectProductRelationDao cmsSubjectProductRelationDao;

    @Override
    public Integer insertSubjectProductRelationList(List<CmsSubjectProductRelation> subjectProductRelationList) {
        return cmsSubjectProductRelationDao.insertList(subjectProductRelationList);
    }
}
