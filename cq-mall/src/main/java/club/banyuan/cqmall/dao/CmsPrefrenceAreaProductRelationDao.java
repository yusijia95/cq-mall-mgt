package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.CmsPrefrenceAreaProductRelation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmsPrefrenceAreaProductRelationDao {
    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceAreaProductRelation record);

    int insertSelective(CmsPrefrenceAreaProductRelation record);

    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);

    Integer insertList(List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}