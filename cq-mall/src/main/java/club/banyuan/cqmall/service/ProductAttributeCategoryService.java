package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.PmsProductAttributeCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductAttributeCategoryService {

    List<PmsProductAttributeCategory> selectProductAttributeCategoryList();
}