package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.PmsProductLadderDao;
import club.banyuan.cqmall.dao.entity.PmsProductLadder;
import club.banyuan.cqmall.service.ProductLadderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductLadderServiceImpl implements ProductLadderService {

    @Autowired
    PmsProductLadderDao pmsProductLadderDao;

    @Override
    public Integer insertProductLadderList(List<PmsProductLadder> productLadderList) {
        return pmsProductLadderDao.insertList(productLadderList);
    }
}
