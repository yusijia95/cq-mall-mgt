package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.PmsMemberPriceDao;
import club.banyuan.cqmall.dao.entity.PmsMemberPrice;
import club.banyuan.cqmall.service.MemberPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberPriceServiceImpl implements MemberPriceService {

    @Autowired
    PmsMemberPriceDao pmsMemberPriceDao;

    @Override
    public Integer insertMemberPriceList(List<PmsMemberPrice> memberPriceList) {
        return pmsMemberPriceDao.insertList(memberPriceList);
    }
}
