package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.PmsMemberPrice;

import java.util.List;

public interface MemberPriceService {
    Integer insertMemberPriceList(List<PmsMemberPrice> memberPriceList);
}
