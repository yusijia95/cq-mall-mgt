package club.banyuan.cqmall.vo;

import club.banyuan.cqmall.dao.entity.PmsProductCategory;

import java.util.List;

public class ProductCategoryWithChildren {


    /**
     * id : 1
     * parentId : null
     * name : 服装
     * level : null
     * productCount : null
     * productUnit : null
     * navStatus : null
     * showStatus : null
     * sort : null
     * icon : null
     * keywords : null
     * description : null
     * children : []
     */

    private int id;
    private Object parentId;
    private String name;
    private Object level;
    private Object productCount;
    private Object productUnit;
    private Object navStatus;
    private Object showStatus;
    private Object sort;
    private Object icon;
    private Object keywords;
    private Object description;
    private List<PmsProductCategory> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getLevel() {
        return level;
    }

    public void setLevel(Object level) {
        this.level = level;
    }

    public Object getProductCount() {
        return productCount;
    }

    public void setProductCount(Object productCount) {
        this.productCount = productCount;
    }

    public Object getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(Object productUnit) {
        this.productUnit = productUnit;
    }

    public Object getNavStatus() {
        return navStatus;
    }

    public void setNavStatus(Object navStatus) {
        this.navStatus = navStatus;
    }

    public Object getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Object showStatus) {
        this.showStatus = showStatus;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public Object getIcon() {
        return icon;
    }

    public void setIcon(Object icon) {
        this.icon = icon;
    }

    public Object getKeywords() {
        return keywords;
    }

    public void setKeywords(Object keywords) {
        this.keywords = keywords;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public List<?> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "ProductCategoryWithChildren{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", productCount=" + productCount +
                ", productUnit=" + productUnit +
                ", navStatus=" + navStatus +
                ", showStatus=" + showStatus +
                ", sort=" + sort +
                ", icon=" + icon +
                ", keywords=" + keywords +
                ", description=" + description +
                ", children=" + children +
                '}';
    }
}
