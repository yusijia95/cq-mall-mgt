package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsProductAttribute;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsProductAttributeDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttribute record);

    int insertSelective(PmsProductAttribute record);

    PmsProductAttribute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttribute record);

    int updateByPrimaryKey(PmsProductAttribute record);

    List<PmsProductAttribute> selectProductAttributeList();

    List<PmsProductAttribute> selectProductAttributeListByType(Integer type);
}