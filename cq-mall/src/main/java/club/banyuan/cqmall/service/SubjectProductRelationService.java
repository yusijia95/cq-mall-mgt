package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.CmsSubjectProductRelation;

import java.util.List;

public interface SubjectProductRelationService {
    Integer insertSubjectProductRelationList(List<CmsSubjectProductRelation> subjectProductRelationList);
}
