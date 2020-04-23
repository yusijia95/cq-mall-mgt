package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.CmsSubjectProductRelation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmsSubjectProductRelationDao {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectProductRelation record);

    int insertSelective(CmsSubjectProductRelation record);

    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectProductRelation record);

    int updateByPrimaryKey(CmsSubjectProductRelation record);

    Integer insertList(List<CmsSubjectProductRelation> subjectProductRelationList);
}