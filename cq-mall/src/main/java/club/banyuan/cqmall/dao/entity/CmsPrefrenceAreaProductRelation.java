package club.banyuan.cqmall.dao.entity;

import java.io.Serializable;

/**
 * cms_prefrence_area_product_relation
 * @author 
 */
public class CmsPrefrenceAreaProductRelation implements Serializable {
    private Long id;

    private Long prefrenceAreaId;

    private Long productId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrefrenceAreaId() {
        return prefrenceAreaId;
    }

    public void setPrefrenceAreaId(Long prefrenceAreaId) {
        this.prefrenceAreaId = prefrenceAreaId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "CmsPrefrenceAreaProductRelation{" +
                "id=" + id +
                ", prefrenceAreaId=" + prefrenceAreaId +
                ", productId=" + productId +
                '}';
    }
}