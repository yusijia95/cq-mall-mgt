package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.UmsMemberLevelDao;
import club.banyuan.cqmall.dao.entity.UmsMemberLevel;
import club.banyuan.cqmall.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberLevelServiceImpl implements MemberLevelService {

    @Autowired
    UmsMemberLevelDao umsMemberLevelDao;

    @Override
    public List<UmsMemberLevel> selectListByDefaultStatus(Integer defaultStatus) {
        return umsMemberLevelDao.selectByDefaultStatus(defaultStatus);
    }
}
