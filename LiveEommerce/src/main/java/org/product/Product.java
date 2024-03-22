package org.product;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.math.BigDecimal;
import java.sql.Timestamp;


@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private Integer stockQty;

    @Lob
    private byte[] productImg;

    private Timestamp lastUpdated;

//    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Integer categoryId;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }



    public Product() {
    }


    public Product(String name, String description, BigDecimal price, Integer stockQty, byte[] productImg, Timestamp lastUpdated, Integer categoryId) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQty = stockQty;
        this.productImg = productImg;
        this.lastUpdated = lastUpdated;
        this.categoryId = categoryId;
    }


   

}
