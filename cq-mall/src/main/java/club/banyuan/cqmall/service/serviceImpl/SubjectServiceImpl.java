package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.constant.CacheKey;
import club.banyuan.cqmall.dao.CmsSubjectDao;
import club.banyuan.cqmall.dao.entity.CmsSubject;
import club.banyuan.cqmall.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    CmsSubjectDao cmsSubjectDao;

    @Cacheable(value = CacheKey.SUBJECT_LIST,key = "'" + CacheKey.CACHE_KEY_ALL+"'")
    @Override
    public List<CmsSubject> selectAll() {
        return cmsSubjectDao.selectAll();
    }
}
