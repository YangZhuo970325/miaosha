package com.miaoshaproject.controller.ViewObject;

import org.joda.time.DateTime;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ItemVO {

    private Integer id;

    //商品名称
    private String title;

    //商品价格
    private BigDecimal price;

    //商品的库存
    private Integer stock;

    //商品描述
    private String description;

    //商品的销量
    private Integer sales;

    //商品描述图片
    private String imgUrl;

    //商品是否在秒杀活动中，以及对应状态 0：没有秒杀活动 1：秒杀活动未开始 2：秒杀活动进行中
    private Integer promoStatus;

    private BigDecimal promoPrice;

    private Integer promoId;

    private String startDate;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getPromoStatus() {
        return promoStatus;
    }

    public void setPromoStatus(Integer promoStatus) {
        this.promoStatus = promoStatus;
    }

    public BigDecimal getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(BigDecimal promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
