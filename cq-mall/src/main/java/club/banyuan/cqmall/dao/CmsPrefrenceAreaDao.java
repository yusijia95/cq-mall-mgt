package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.CmsPrefrenceArea;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmsPrefrenceAreaDao {
    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceArea record);

    int insertSelective(CmsPrefrenceArea record);

    CmsPrefrenceArea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    int updateByPrimaryKeyWithBLOBs(CmsPrefrenceArea record);

    int updateByPrimaryKey(CmsPrefrenceArea record);

    List<CmsPrefrenceArea> selectAll();
}