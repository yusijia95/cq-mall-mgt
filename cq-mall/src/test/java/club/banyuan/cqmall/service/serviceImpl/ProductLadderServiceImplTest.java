package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.entity.PmsProductLadder;
import club.banyuan.cqmall.service.ProductLadderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class ProductLadderServiceImplTest {

    @Autowired
    ProductLadderService productLadderService;

    @Test
    void insertProductLadderList() {
        PmsProductLadder ladder=new PmsProductLadder();
        ladder.setDiscount(BigDecimal.valueOf(7));
        ladder.setCount(7);
        ladder.setProductId(7L);
        ladder.setPrice(BigDecimal.valueOf(7));
        PmsProductLadder ladder2=new PmsProductLadder();
        ladder2.setDiscount(BigDecimal.valueOf(6));
        ladder2.setCount(6);
        ladder2.setProductId(6L);
        ladder2.setPrice(BigDecimal.valueOf(6));
        List<PmsProductLadder> ladders=new ArrayList<>();
        ladders.add(ladder);
        ladders.add(ladder2);
        productLadderService.insertProductLadderList(ladders);
        System.out.println(ladder.getId());
        System.out.println(ladder2.getId());
    }
}