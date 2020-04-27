package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.constant.CacheKey;
import club.banyuan.cqmall.dao.UmsMemberLevelDao;
import club.banyuan.cqmall.dao.entity.UmsMemberLevel;
import club.banyuan.cqmall.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberLevelServiceImpl implements MemberLevelService {

    @Autowired
    UmsMemberLevelDao umsMemberLevelDao;

    @Cacheable(value = CacheKey.MEMBER_LIST,key = "#defaultStatus")
    @Override
    public List<UmsMemberLevel> selectListByDefaultStatus(Integer defaultStatus) {
        return umsMemberLevelDao.selectByDefaultStatus(defaultStatus);
    }
}
