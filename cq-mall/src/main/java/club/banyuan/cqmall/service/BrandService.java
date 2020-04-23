package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.PmsBrand;
import club.banyuan.cqmall.dto.PmsBrandDto;

import java.util.List;

public interface BrandService {

    List<PmsBrand> selectBrandList(String keyword);

    PmsBrand selectBrandById(Long id);

    Integer updateBrandById(PmsBrandDto pmsBrandDto);

    Integer createBrand(PmsBrandDto pmsBrandDto);
}
