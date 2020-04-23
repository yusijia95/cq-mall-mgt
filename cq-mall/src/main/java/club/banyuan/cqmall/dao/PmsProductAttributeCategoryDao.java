package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsProductAttribute;
import club.banyuan.cqmall.dao.entity.PmsProductAttributeCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsProductAttributeCategoryDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeCategory record);

    int insertSelective(PmsProductAttributeCategory record);

    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    int updateByPrimaryKey(PmsProductAttributeCategory record);

    List<PmsProductAttributeCategory> selectProductAttributeCategoryList();
}