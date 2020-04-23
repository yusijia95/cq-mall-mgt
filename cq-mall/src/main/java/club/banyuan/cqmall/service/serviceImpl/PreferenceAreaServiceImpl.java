package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.CmsPrefrenceAreaDao;
import club.banyuan.cqmall.dao.entity.CmsPrefrenceArea;
import club.banyuan.cqmall.service.PreferenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceAreaServiceImpl implements PreferenceAreaService {

    @Autowired
    CmsPrefrenceAreaDao cmsPrefrenceAreaDao;

    @Override
    public List<CmsPrefrenceArea> selectAll() {
        return cmsPrefrenceAreaDao.selectAll();
    }
}
