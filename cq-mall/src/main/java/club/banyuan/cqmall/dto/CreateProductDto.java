package club.banyuan.cqmall.dto;

import club.banyuan.cqmall.dao.entity.*;

import java.util.List;

public class CreateProductDto {


    /**
     * albumPics : string
     * brandId : 0
     * brandName : string
     * deleteStatus : 0
     * description : string
     * detailDesc : string
     * detailHtml : string
     * detailMobileHtml : string
     * detailTitle : string
     * feightTemplateId : 0
     * giftGrowth : 0
     * giftPoint : 0
     * id : 0
     * keywords : string
     * lowStock : 0
     * memberPriceList : [{"id":0,"memberLevelId":0,"memberLevelName":"string","memberPrice":0,"productId":0}]
     * name : string
     * newStatus : 0
     * note : string
     * originalPrice : 0
     * pic : string
     * prefrenceAreaProductRelationList : [{"id":0,"prefrenceAreaId":0,"productId":0}]
     * previewStatus : 0
     * price : 0
     * productAttributeCategoryId : 0
     * productAttributeValueList : [{"id":0,"productAttributeId":0,"productId":0,"value":"string"}]
     * productCategoryId : 0
     * productCategoryName : string
     * productFullReductionList : [{"fullPrice":0,"id":0,"productId":0,"reducePrice":0}]
     * productLadderList : [{"count":0,"discount":0,"id":0,"price":0,"productId":0}]
     * productSn : string
     * promotionEndTime : 2020-04-14T08:17:32.540Z
     * promotionPerLimit : 0
     * promotionPrice : 0
     * promotionStartTime : 2020-04-14T08:17:32.540Z
     * promotionType : 0
     * publishStatus : 0
     * recommandStatus : 0
     * sale : 0
     * serviceIds : string
     * skuStockList : [{"id":0,"lockStock":0,"lowStock":0,"pic":"string","price":0,"productId":0,"promotionPrice":0,"sale":0,"skuCode":"string","spData":"string","stock":0}]
     * sort : 0
     * stock : 0
     * subTitle : string
     * subjectProductRelationList : [{"id":0,"productId":0,"subjectId":0}]
     * unit : string
     * usePointLimit : 0
     * verifyStatus : 0
     * weight : 0
     */

    private String albumPics;
    private int brandId;
    private String brandName;
    private int deleteStatus;
    private String description;
    private String detailDesc;
    private String detailHtml;
    private String detailMobileHtml;
    private String detailTitle;
    private int feightTemplateId;
    private int giftGrowth;
    private int giftPoint;
    private Long id;
    private String keywords;
    private int lowStock;
    private String name;
    private int newStatus;
    private String note;
    private int originalPrice;
    private String pic;
    private int previewStatus;
    private int price;
    private int productAttributeCategoryId;
    private int productCategoryId;
    private String productCategoryName;
    private String productSn;
    private String promotionEndTime;
    private int promotionPerLimit;
    private int promotionPrice;
    private String promotionStartTime;
    private int promotionType;
    private int publishStatus;
    private int recommandStatus;
    private int sale;
    private String serviceIds;
    private int sort;
    private int stock;
    private String subTitle;
    private String unit;
    private int usePointLimit;
    private int verifyStatus;
    private int weight;
    private List<PmsMemberPrice> memberPriceList;
    private List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;
    private List<PmsProductAttributeValue> productAttributeValueList;
    private List<PmsProductFullReduction> productFullReductionList;
    private List<PmsProductLadder> productLadderList;
    private List<PmsSkuStock> skuStockList;
    private List<CmsSubjectProductRelation> subjectProductRelationList;

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getDetailHtml() {
        return detailHtml;
    }

    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    public int getFeightTemplateId() {
        return feightTemplateId;
    }

    public void setFeightTemplateId(int feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
    }

    public int getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(int giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public int getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(int giftPoint) {
        this.giftPoint = giftPoint;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getLowStock() {
        return lowStock;
    }

    public void setLowStock(int lowStock) {
        this.lowStock = lowStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(int newStatus) {
        this.newStatus = newStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getPreviewStatus() {
        return previewStatus;
    }

    public void setPreviewStatus(int previewStatus) {
        this.previewStatus = previewStatus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    public void setProductAttributeCategoryId(int productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public String getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(String promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public int getPromotionPerLimit() {
        return promotionPerLimit;
    }

    public void setPromotionPerLimit(int promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    public int getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(int promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public String getPromotionStartTime() {
        return promotionStartTime;
    }

    public void setPromotionStartTime(String promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public int getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(int promotionType) {
        this.promotionType = promotionType;
    }

    public int getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(int publishStatus) {
        this.publishStatus = publishStatus;
    }

    public int getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(int recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public String getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getUsePointLimit() {
        return usePointLimit;
    }

    public void setUsePointLimit(int usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    public int getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(int verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<PmsMemberPrice> getMemberPriceList() {
        return memberPriceList;
    }

    public void setMemberPriceList(List<PmsMemberPrice> memberPriceList) {
        this.memberPriceList = memberPriceList;
    }

    public List<CmsPrefrenceAreaProductRelation> getPrefrenceAreaProductRelationList() {
        return prefrenceAreaProductRelationList;
    }

    public void setPrefrenceAreaProductRelationList(List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        this.prefrenceAreaProductRelationList = prefrenceAreaProductRelationList;
    }

    public List<PmsProductAttributeValue> getProductAttributeValueList() {
        return productAttributeValueList;
    }

    public void setProductAttributeValueList(List<PmsProductAttributeValue> productAttributeValueList) {
        this.productAttributeValueList = productAttributeValueList;
    }

    public List<PmsProductFullReduction> getProductFullReductionList() {
        return productFullReductionList;
    }

    public void setProductFullReductionList(List<PmsProductFullReduction> productFullReductionList) {
        this.productFullReductionList = productFullReductionList;
    }

    public List<PmsProductLadder> getProductLadderList() {
        return productLadderList;
    }

    public void setProductLadderList(List<PmsProductLadder> productLadderList) {
        this.productLadderList = productLadderList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

    public List<CmsSubjectProductRelation> getSubjectProductRelationList() {
        return subjectProductRelationList;
    }

    public void setSubjectProductRelationList(List<CmsSubjectProductRelation> subjectProductRelationList) {
        this.subjectProductRelationList = subjectProductRelationList;
    }

}
