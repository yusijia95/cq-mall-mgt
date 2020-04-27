package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.common.BadRequestDetails;
import club.banyuan.cqmall.common.CommonResult;
import club.banyuan.cqmall.constant.CacheKey;
import club.banyuan.cqmall.dao.UmsResourceDao;
import club.banyuan.cqmall.dao.entity.UmsResource;
import club.banyuan.cqmall.dao.entity.UmsResourceExample;
import club.banyuan.cqmall.dto.UmsResourceDto;
import club.banyuan.cqmall.service.ResourceService;
import club.banyuan.cqmall.service.RoleService;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class
ResourceServiceImpl implements ResourceService {

    @Autowired
    UmsResourceDao umsResourceDao;

    @Autowired
    RoleService roleService;

    @Cacheable(value = CacheKey.RESOURCE_LIST, key = "'" + CacheKey.CACHE_KEY_ALL + "'")
    @Override
    public List<UmsResource> selectAllResource() {
        return umsResourceDao.selectAllResource();
    }

    @Override
    public List<UmsResource> selectResourceByUsername(String username) {
        return umsResourceDao.selectResourceByUsername(username);
    }

    @Override
    public List<UmsResource> selectResourceList(String nameKeyword, String urlKeyword, Long categoryId) {
        UmsResourceExample umsResourceExample = new UmsResourceExample();
        UmsResourceExample.Criteria criteria = umsResourceExample.createCriteria();
        if (categoryId != null) {
            criteria.andCategoryIdEqualTo(categoryId);
        }
        if (StrUtil.isNotBlank(nameKeyword)) {
            criteria.andNameLike(StrUtil.concat(true, "%", nameKeyword, "%"));
        }
        if (StrUtil.isNotBlank(urlKeyword)) {
            criteria.andUrlLike(StrUtil.concat(true, "%", urlKeyword, "%"));
        }
        return umsResourceDao.selectByExample(umsResourceExample);
    }

    @CacheEvict(value = CacheKey.RESOURCE_LIST, key = "'" + CacheKey.CACHE_KEY_ALL + "'", allEntries = true)
    @Override
    public Integer insertResource(UmsResourceDto umsResourceDto) {
        UmsResource umsResource = new UmsResource();
        BeanUtil.copyProperties(umsResourceDto, umsResource);
        umsResource.setCreateTime(new Date());
        return umsResourceDao.insert(umsResource);
    }

    @CacheEvict(value = CacheKey.RESOURCE_LIST, key = "'" + CacheKey.CACHE_KEY_ALL + "'", allEntries = true)
    @Override
    public Integer updateResource(UmsResourceDto umsResourceDto) {
        UmsResource umsResource = new UmsResource();
        BeanUtil.copyProperties(umsResourceDto, umsResource);
        return umsResourceDao.updateByPrimaryKey(umsResource);
    }

    @CacheEvict(value = CacheKey.RESOURCE_LIST, key = "'" + CacheKey.CACHE_KEY_ALL + "'", allEntries = true)
    @Override
    public Integer deleteResource(Long id) {
        List<Long> roleIds = roleService.selectRoleIdsByResourceIds(Collections.singletonList(id));
        if (CollectionUtil.isNotEmpty(roleIds)) {
            CommonResult.badRuquest(BadRequestDetails.RESOURCE_ROLE_DELETE_ERROR);
        }
        return umsResourceDao.deleteByPrimaryKey(id);
    }
}
