package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsProductLadder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsProductLadderDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductLadder record);

    int insertSelective(PmsProductLadder record);

    PmsProductLadder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductLadder record);

    int updateByPrimaryKey(PmsProductLadder record);

    Integer insertList(List<PmsProductLadder> productLadderList);
}