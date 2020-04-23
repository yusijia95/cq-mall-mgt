package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.UmsMemberLevel;

import java.util.List;

public interface MemberLevelService {

    List<UmsMemberLevel> selectListByDefaultStatus(Integer defaultStatus);
}
