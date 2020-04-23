package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsSkuStock;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsSkuStockDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStock record);

    int insertSelective(PmsSkuStock record);

    PmsSkuStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuStock record);

    int updateByPrimaryKey(PmsSkuStock record);

    Integer insertList(List<PmsSkuStock> skuStockList);
}