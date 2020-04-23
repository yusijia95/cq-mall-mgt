package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.PmsProduct;
import club.banyuan.cqmall.dto.CreateProductDto;

import java.util.List;

public interface ProductService {

    Integer insertProduct(CreateProductDto productDto);

    List<PmsProduct> selectProducts();

    List<PmsProduct> selectProducts(Integer publishStatus, Integer verifyStatus, String keyword, String productSn, Long productCategoryId, Long brandId);
}
