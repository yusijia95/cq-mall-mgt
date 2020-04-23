package club.banyuan.cqmall.dao;

import club.banyuan.cqmall.dao.entity.PmsProductLadder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PmsProductLadderDaoTest {

    @Autowired
    PmsProductLadderDao pmsProductLadderDao;

    @Test
    void insert() {
        PmsProductLadder ladder=new PmsProductLadder();
        ladder.setDiscount(BigDecimal.valueOf(5));
        ladder.setCount(5);
        ladder.setProductId(5L);
        ladder.setPrice(BigDecimal.valueOf(5));
        System.out.println(ladder);
        pmsProductLadderDao.insert(ladder);
    }
}