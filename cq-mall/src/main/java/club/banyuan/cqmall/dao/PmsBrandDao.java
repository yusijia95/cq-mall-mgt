package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsBrand;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsBrandDao {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);

    List<PmsBrand> selectBrandList(@Param("keyword") String keyword);
}