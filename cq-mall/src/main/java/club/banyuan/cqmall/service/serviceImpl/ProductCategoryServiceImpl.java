package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.constant.CacheKey;
import club.banyuan.cqmall.constant.ProductCategoryConstant;
import club.banyuan.cqmall.dao.PmsProductCategoryDao;
import club.banyuan.cqmall.dao.entity.PmsProductCategory;
import club.banyuan.cqmall.service.ProductCategoryService;
import club.banyuan.cqmall.vo.ProductCategoryWithChildren;
import cn.hutool.core.bean.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    PmsProductCategoryDao pmsProductCategoryDao;

    @Override
    public List<PmsProductCategory> selectProductCategoryListByParentId(Long parentId) {
        return pmsProductCategoryDao.selectProductCategoryListByParentId(parentId);
    }

    @Cacheable(value = CacheKey.PRODUCT_CATEGORY_LIST,key = "'"+CacheKey.CACHE_KEY_WITHCHILDREN+"'")
    @Override
    public List<ProductCategoryWithChildren> selectProductAttributeList() {
        List<PmsProductCategory> pmsProductCategories = pmsProductCategoryDao.selectAllName();
        List<ProductCategoryWithChildren> list = new ArrayList<>();
        pmsProductCategories.stream().filter(t -> {
            return t.getParentId() == ProductCategoryConstant.PARENTID_PARENT;
        }).forEach(t -> {
            ProductCategoryWithChildren children = new ProductCategoryWithChildren();
            BeanUtil.copyProperties(t, children);
            list.add(children);
        });

        list.forEach(t -> {
            t.setChildren(pmsProductCategories.stream().filter(r -> {
                return r.getParentId() == t.getId();
            }).collect(Collectors.toList()));
        });
        return list;
    }
}
