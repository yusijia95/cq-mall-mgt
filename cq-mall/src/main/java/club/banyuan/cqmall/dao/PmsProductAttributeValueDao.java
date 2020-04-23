package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsProductAttributeValue;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsProductAttributeValueDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeValue record);

    int insertSelective(PmsProductAttributeValue record);

    PmsProductAttributeValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttributeValue record);

    int updateByPrimaryKey(PmsProductAttributeValue record);

    Integer insertList(List<PmsProductAttributeValue> productAttributeValueList);
}