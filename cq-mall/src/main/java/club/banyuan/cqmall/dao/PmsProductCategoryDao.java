package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsProductAttribute;
import club.banyuan.cqmall.dao.entity.PmsProductCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsProductCategoryDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategory record);

    int insertSelective(PmsProductCategory record);

    PmsProductCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductCategory record);

    int updateByPrimaryKey(PmsProductCategory record);

    List<PmsProductCategory> selectProductCategoryListByParentId(Long parentId);

    List<PmsProductCategory> selectProductCategoryNameByParentId(Long parentId);

    List<PmsProductCategory> selectAllName();

}