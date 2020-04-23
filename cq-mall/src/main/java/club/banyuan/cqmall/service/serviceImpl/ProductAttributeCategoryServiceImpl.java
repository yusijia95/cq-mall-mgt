package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.PmsProductAttributeCategoryDao;
import club.banyuan.cqmall.dao.entity.PmsProductAttributeCategory;
import club.banyuan.cqmall.service.ProductAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductAttributeCategoryServiceImpl implements ProductAttributeCategoryService {

    @Autowired
    PmsProductAttributeCategoryDao pmsProductAttributeCategoryDao;


    @Override
    public List<PmsProductAttributeCategory> selectProductAttributeCategoryList() {
        return pmsProductAttributeCategoryDao.selectProductAttributeCategoryList();
    }
}
