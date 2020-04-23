package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MenuServiceImplTest {

    @Autowired
    MenuService menuService;

    @Test
    void selectAllMenu() {
        menuService.selectAllMenu();
    }
}