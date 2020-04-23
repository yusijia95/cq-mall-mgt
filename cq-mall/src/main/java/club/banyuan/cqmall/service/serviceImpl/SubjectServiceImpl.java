package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.CmsSubjectDao;
import club.banyuan.cqmall.dao.entity.CmsSubject;
import club.banyuan.cqmall.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    CmsSubjectDao cmsSubjectDao;

    @Override
    public List<CmsSubject> selectAll() {
        return cmsSubjectDao.selectAll();
    }
}
