package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.PmsProductFullReductionDao;
import club.banyuan.cqmall.dao.entity.PmsProductFullReduction;
import club.banyuan.cqmall.service.ProductFullReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductFullReductionServiceImpl implements ProductFullReductionService {

   @Autowired
    PmsProductFullReductionDao pmsProductFullReductionDao;

    @Override
    public Integer insertProductFullReductionList(List<PmsProductFullReduction> productFullReductionList) {
        return pmsProductFullReductionDao.insertList(productFullReductionList);
    }
}
