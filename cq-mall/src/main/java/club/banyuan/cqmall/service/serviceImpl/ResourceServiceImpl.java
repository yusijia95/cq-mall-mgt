package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.common.CommonPage;
import club.banyuan.cqmall.dao.UmsResourceDao;
import club.banyuan.cqmall.dao.entity.UmsResource;
import club.banyuan.cqmall.dao.entity.UmsResourceExample;
import club.banyuan.cqmall.service.ResourceService;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public List<UmsResource> selectResourceList(String nameKeyword, String urlKeyword, Long categoryId) {
        UmsResourceExample umsResourceExample=new UmsResourceExample();
        UmsResourceExample.Criteria criteria=umsResourceExample.createCriteria();
        if (categoryId!=-1){
            criteria.andCategoryIdEqualTo(categoryId);
        }
        if (StrUtil.isNotBlank(nameKeyword)){
            criteria.andNameLike(StrUtil.concat(true,"%",nameKeyword,"%"));
        }
        if (StrUtil.isNotBlank(urlKeyword)){
            criteria.andUrlLike(StrUtil.concat(true,"%",urlKeyword,"%"));
        }
        return umsResourceDao.selectByExample(umsResourceExample);
    }
}
