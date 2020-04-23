package club.banyuan.cqmall.dao.entity;

import java.io.Serializable;

/**
 * pms_product_attribute_category
 * @author 
 */
public class PmsProductAttributeCategory implements Serializable {
    private Long id;

    private String name;

    /**
     * 属性数量
     */
    private Integer attributeCount;

    /**
     * 参数数量
     */
    private Integer paramCount;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    public Integer getParamCount() {
        return paramCount;
    }

    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "PmsProductAttributeCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attributeCount=" + attributeCount +
                ", paramCount=" + paramCount +
                '}';
    }
}