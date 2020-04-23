package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.PmsProductAttributeValueDao;
import club.banyuan.cqmall.dao.entity.PmsProductAttributeValue;
import club.banyuan.cqmall.service.ProductAttributeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductAttributeValueServiceImpl implements ProductAttributeValueService {

    @Autowired
    PmsProductAttributeValueDao pmsProductAttributeValueDao;

    @Override
    public Integer insertProdcutAttributeValueList(List<PmsProductAttributeValue> productAttributeValueList) {
        return pmsProductAttributeValueDao.insertList(productAttributeValueList);
    }
}
