package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsProductFullReduction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsProductFullReductionDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductFullReduction record);

    int insertSelective(PmsProductFullReduction record);

    PmsProductFullReduction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    int updateByPrimaryKey(PmsProductFullReduction record);

    Integer insertList(List<PmsProductFullReduction> productFullReductionList);
}