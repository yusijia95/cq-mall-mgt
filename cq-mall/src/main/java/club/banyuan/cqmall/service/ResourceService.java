package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.UmsResource;

import java.util.List;

public interface ResourceService {
    List<UmsResource> selectAllResource();

    List<UmsResource> selectResourceByUsername(String username);
}
