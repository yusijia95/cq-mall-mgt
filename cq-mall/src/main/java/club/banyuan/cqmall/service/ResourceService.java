package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.UmsResource;
import club.banyuan.cqmall.dto.UmsResourceDto;

import java.util.List;

public interface ResourceService {
    List<UmsResource> selectResourceByUsername(String username);

    List<UmsResource> selectAllResource();

    List<UmsResource> selectResourceList(String nameKeyword, String urlKeyword, Long categoryId);

    Integer insertResource(UmsResourceDto umsResourceDto);

    Integer updateResource(UmsResourceDto umsResourceDto);

    Integer deleteResource(Long id);
}
