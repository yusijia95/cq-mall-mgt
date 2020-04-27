package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.dao.PmsProductDao;
import club.banyuan.cqmall.dao.entity.*;
import club.banyuan.cqmall.dto.CreateProductDto;
import club.banyuan.cqmall.service.*;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    PmsProductDao pmsProductDao;

//    @Autowired
//    SqlSessionFactory sqlSessionFactory;

    @Autowired
    ProductLadderService productLadderService;
    @Autowired
    ProductFullReductionService productFullReductionService;
    @Autowired
    ProductAttributeValueService productAttributeValueService;
    @Autowired
    SubjectProductRelationService subjectProductRelationService;
    @Autowired
    SkuStockService skuStockService;
    @Autowired
    MemberPriceService memberPriceService;
    @Autowired
    PreferenceAreaProductRelationService preferenceAreaProductRelationService;

    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRES_NEW)
    @Override
    public Integer insertProduct(CreateProductDto productDto) {
//        List<PmsProductLadder> ladders=new ArrayList<>();
//        productDto.getProductLadderList().stream().map(ladders::add);
        PmsProduct pmsProduct = new PmsProduct();
        BeanUtil.copyProperties(productDto, pmsProduct);
        Integer integer = pmsProductDao.insert(pmsProduct);
        logger.info("productId:{}",pmsProduct.getId());
        if (CollectionUtil.isNotEmpty(productDto.getProductLadderList())) {
            List<PmsProductLadder> collect = productDto.getProductLadderList().stream().peek(t -> t.setProductId(pmsProduct.getId())).collect(Collectors.toList());
            productLadderService.insertProductLadderList(collect);
        }
        if (CollectionUtil.isNotEmpty(productDto.getProductFullReductionList())) {
            List<PmsProductFullReduction> collect = productDto.getProductFullReductionList().stream().peek(t -> t.setProductId(pmsProduct.getId())).collect(Collectors.toList());
            productFullReductionService.insertProductFullReductionList(collect);
        }
        if (CollectionUtil.isNotEmpty(productDto.getProductAttributeValueList())) {
            List<PmsProductAttributeValue> collect = productDto.getProductAttributeValueList().stream().peek(t -> t.setProductId(pmsProduct.getId())).collect(Collectors.toList());
            logger.info("value:{}",collect);
            productAttributeValueService.insertProdcutAttributeValueList(collect);
        }
        if (CollectionUtil.isNotEmpty(productDto.getSubjectProductRelationList())) {
            List<CmsSubjectProductRelation> collect = productDto.getSubjectProductRelationList().stream().peek(t -> t.setProductId(pmsProduct.getId())).collect(Collectors.toList());
            logger.info("subject:{}",collect);
            subjectProductRelationService.insertSubjectProductRelationList(collect);
        }
        if (CollectionUtil.isNotEmpty(productDto.getSkuStockList())) {
            List<PmsSkuStock> collect = productDto.getSkuStockList().stream().peek(t -> t.setProductId(pmsProduct.getId())).collect(Collectors.toList());
            logger.info("sku:{}",collect);
            skuStockService.insertSkuStockList(collect);
        }
        if (CollectionUtil.isNotEmpty(productDto.getMemberPriceList())) {
            List<PmsMemberPrice> collect = productDto.getMemberPriceList().stream().peek(t -> t.setProductId(pmsProduct.getId())).collect(Collectors.toList());
            logger.info("member:{}",collect);
            memberPriceService.insertMemberPriceList(collect);
        }
        if (CollectionUtil.isNotEmpty(productDto.getPrefrenceAreaProductRelationList())) {
            List<CmsPrefrenceAreaProductRelation> collect = productDto.getPrefrenceAreaProductRelationList().stream().peek(t -> t.setProductId(pmsProduct.getId())).collect(Collectors.toList());
            logger.info("prefer:{}",collect);
            preferenceAreaProductRelationService.insertPreferenceAreaProductRelation(collect);
        }
        return integer;
    }

    @Override
    public List<PmsProduct> selectProducts() {
        return pmsProductDao.selectProducts();
    }


    @Override
    public List<PmsProduct> selectProducts(Integer publishStatus, Integer verifyStatus, String keyword, String productSn, Long productCategoryId, Long brandId) {
        return pmsProductDao.selectProductsByKeyword(keyword,publishStatus,verifyStatus,productSn,productCategoryId,brandId);
    }
}
