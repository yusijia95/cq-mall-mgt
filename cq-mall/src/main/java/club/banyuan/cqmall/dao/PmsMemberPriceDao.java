package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsMemberPrice;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsMemberPriceDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsMemberPrice record);

    int insertSelective(PmsMemberPrice record);

    PmsMemberPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsMemberPrice record);

    int updateByPrimaryKey(PmsMemberPrice record);

    Integer insertList(List<PmsMemberPrice> memberPriceList);
}