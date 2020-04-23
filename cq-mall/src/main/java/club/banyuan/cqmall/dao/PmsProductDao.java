package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsProduct;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsProductDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProduct record);

    int insertSelective(PmsProduct record);

    PmsProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProduct record);

    int updateByPrimaryKey(PmsProduct record);

    List<PmsProduct> selectProducts();

    List<PmsProduct> selectProductsByKeyword(@Param("keyword") String keyword, @Param("publishStatus") Integer publishStatus,
                                             @Param("verifyStatus") Integer verifyStatus, @Param("productSn") String productSn,
                                             @Param("productCategoryId") Long productCategoryId, @Param("brandId") Long brandId);
}