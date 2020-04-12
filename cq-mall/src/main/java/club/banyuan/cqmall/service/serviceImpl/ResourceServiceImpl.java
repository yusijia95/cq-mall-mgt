package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.UmsResourceDao;
import club.banyuan.cqmall.dao.entity.UmsResource;
import club.banyuan.cqmall.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    UmsResourceDao umsResourceDao;

    @Override
    public List<UmsResource> selectAllResource() {
        return umsResourceDao.selectAllResource();
    }

    @Override
    public List<UmsResource> selectResourceByUsername(String username) {
        return umsResourceDao.selectResourceByUsername(username);
    }
}
