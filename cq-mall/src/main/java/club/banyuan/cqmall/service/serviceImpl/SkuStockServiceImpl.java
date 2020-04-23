package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.PmsSkuStockDao;
import club.banyuan.cqmall.dao.entity.PmsSkuStock;
import club.banyuan.cqmall.service.SkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkuStockServiceImpl implements SkuStockService {

    @Autowired
    PmsSkuStockDao pmsSkuStockDao;

    @Override
    public Integer insertSkuStockList(List<PmsSkuStock> skuStockList) {
        return pmsSkuStockDao.insertList(skuStockList);
    }
}
