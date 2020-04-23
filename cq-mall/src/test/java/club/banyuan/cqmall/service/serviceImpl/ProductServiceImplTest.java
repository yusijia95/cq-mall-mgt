package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.service.ProductService;
import org.aspectj.lang.annotation.AfterReturning;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceImplTest {

    @Autowired
    ProductService productService;

    @Test
    void insertProduct() {

    }
}