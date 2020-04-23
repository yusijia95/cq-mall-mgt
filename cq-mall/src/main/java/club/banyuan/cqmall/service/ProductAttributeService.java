package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.PmsProductAttribute;

import java.util.List;

public interface ProductAttributeService {
    List<PmsProductAttribute> selectProductAttributeList();

    List<PmsProductAttribute> selectProductAttributeListByType(Integer type);
}
