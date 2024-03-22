package org.product;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class ProductDTO {

    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQty;
    private byte[] productImg;
    private Timestamp lastUpdated;
    private Integer categoryId;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStockQty() {
        return this.stockQty;
    }

    public void setStockQty(Integer stockQty) {
        this.stockQty = stockQty;
    }

    public byte[] getProductImg() {
        return this.productImg;
    }

    public void setProductImg(byte[] productImg) {
        this.productImg = productImg;
    }

    public Timestamp getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

}