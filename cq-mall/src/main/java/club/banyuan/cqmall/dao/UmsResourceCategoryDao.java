package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.UmsResourceCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UmsResourceCategoryDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsResourceCategory record);

    int insertSelective(UmsResourceCategory record);

    UmsResourceCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsResourceCategory record);

    int updateByPrimaryKey(UmsResourceCategory record);

    List<UmsResourceCategory> selectAllResourceCategory();
}