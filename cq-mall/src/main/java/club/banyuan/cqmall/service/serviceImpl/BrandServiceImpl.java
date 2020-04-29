package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.controller.BrandController;
import club.banyuan.cqmall.dao.PmsBrandDao;
import club.banyuan.cqmall.dao.entity.PmsBrand;
import club.banyuan.cqmall.dto.PmsBrandDto;
import club.banyuan.cqmall.service.BrandService;
import cn.hutool.core.bean.BeanUtil;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.BatchUpdateException;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    PmsBrandDao pmsBrandDao;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Override
    public List<PmsBrand> selectBrandList(String keyword) {
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        PmsBrandDao mapper = sqlSession.getMapper(PmsBrandDao.class);
        return pmsBrandDao.selectBrandList(keyword);
    }

    @Override
    public PmsBrand selectBrandById(Long id) {
        return pmsBrandDao.selectByPrimaryKey(id);
    }

    @Override
    public Integer updateBrandById(PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtil.copyProperties(pmsBrandDto, pmsBrand);
        return pmsBrandDao.updateByPrimaryKey(pmsBrand);
    }

    @Override
    public Integer createBrand(PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtil.copyProperties(pmsBrandDto, pmsBrand);
        return pmsBrandDao.insert(pmsBrand);
    }
}
