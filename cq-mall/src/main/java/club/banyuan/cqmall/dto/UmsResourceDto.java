package club.banyuan.cqmall.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * ums_resource
 * @author 
 */
public class UmsResourceDto implements Serializable {
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 资源名称
     */
    @NotBlank(message = "name不能为空")
    private String name;

    /**
     * 资源URL
     */
    @NotBlank(message = "url不能为空")
    private String url;

    /**
     * 描述
     */
    private String description;

    /**
     * 资源分类ID
     */
    @NotNull(message = "categoryId不能为空")
    private Long categoryId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "UmsResource{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}