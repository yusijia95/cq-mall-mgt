package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.CmsSubject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmsSubjectDao {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubject record);

    int insertSelective(CmsSubject record);

    CmsSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubject record);

    int updateByPrimaryKey(CmsSubject record);

    List<CmsSubject> selectAll();
}