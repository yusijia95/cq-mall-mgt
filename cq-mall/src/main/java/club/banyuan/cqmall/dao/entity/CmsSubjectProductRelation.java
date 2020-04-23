package club.banyuan.cqmall.dao.entity;

import java.io.Serializable;

/**
 * cms_subject_product_relation
 * @author 
 */
public class CmsSubjectProductRelation implements Serializable {
    private Long id;

    private Long subjectId;

    private Long productId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
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
        return "CmsSubjectProductRelation{" +
                "id=" + id +
                ", subjectId=" + subjectId +
                ", productId=" + productId +
                '}';
    }
}