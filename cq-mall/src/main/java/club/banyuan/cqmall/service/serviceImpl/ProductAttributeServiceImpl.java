package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.PmsProductAttributeDao;
import club.banyuan.cqmall.dao.entity.PmsProductAttribute;
import club.banyuan.cqmall.service.ProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductAttributeServiceImpl implements ProductAttributeService {

    @Autowired
    PmsProductAttributeDao pmsProductAttributeDao;

    @Override
    public List<PmsProductAttribute> selectProductAttributeList() {
        return pmsProductAttributeDao.selectProductAttributeList();
    }

    @Override
    public List<PmsProductAttribute> selectProductAttributeListByType(Integer type) {
        return pmsProductAttributeDao.selectProductAttributeListByType(type);
    }
}
