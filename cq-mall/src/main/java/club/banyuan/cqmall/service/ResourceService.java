package club.banyuan.cqmall.service;

import club.banyuan.cqmall.common.CommonPage;
import club.banyuan.cqmall.dao.entity.UmsResource;

import java.util.List;

public interface ResourceService {
    List<UmsResource> selectResourceByUsername(String username);

    List<UmsResource> selectAllResource();

    List<UmsResource> selectResourceList(String nameKeyword, String urlKeyword, Long categoryId);
}
