package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.PmsSkuStock;

import java.util.List;

public interface SkuStockService {
    Integer insertSkuStockList(List<PmsSkuStock> skuStockList);
}
