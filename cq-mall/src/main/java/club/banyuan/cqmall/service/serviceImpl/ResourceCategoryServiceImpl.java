package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.UmsResourceCategoryDao;
import club.banyuan.cqmall.dao.entity.UmsResourceCategory;
import club.banyuan.cqmall.service.ResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceCategoryServiceImpl implements ResourceCategoryService {

    @Autowired
    UmsResourceCategoryDao umsResourceCategoryDao;

    @Override
    public List<UmsResourceCategory> selectAllResourceCategory() {
        return umsResourceCategoryDao.selectAllResourceCategory();
    }
}
