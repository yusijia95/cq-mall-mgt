package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.UmsMenuDao;
import club.banyuan.cqmall.dao.entity.UmsMenu;
import club.banyuan.cqmall.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    UmsMenuDao umsMenuDao;

    @Override
    public List<UmsMenu> selectAllMenu() {
        return umsMenuDao.selectAllMenu();
    }
}
