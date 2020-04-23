package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.UmsMemberLevel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UmsMemberLevelDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);

    List<UmsMemberLevel> selectByDefaultStatus(@Param("defaultStatus") Integer defaultStatus);
}