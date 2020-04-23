package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.PmsProductCategory;
import club.banyuan.cqmall.vo.ProductCategoryWithChildren;

import java.util.List;

public interface ProductCategoryService {

    List<PmsProductCategory> selectProductCategoryListByParentId(Long parentId);

    List<ProductCategoryWithChildren> selectProductAttributeList();

}
