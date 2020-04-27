package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.common.CommonPage;
import club.banyuan.cqmall.constant.CacheKey;
import club.banyuan.cqmall.dao.UmsMenuDao;
import club.banyuan.cqmall.dao.entity.UmsMenu;
import club.banyuan.cqmall.service.MenuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    UmsMenuDao umsMenuDao;

    @Cacheable(value = CacheKey.MENU_LIST, key = "'" + CacheKey.CACHE_KEY_ALL + "'")
    @Override
    public List<UmsMenu> selectAllMenu() {
        return umsMenuDao.selectAllMenu();
    }

    @Cacheable(value = CacheKey.MENU_LIST, key ="#parentId")
    @Override
    public List<UmsMenu> selectMenuListByParentId(Long parentId) {
        return umsMenuDao.selectMenusByParentId(parentId);
    }

}
