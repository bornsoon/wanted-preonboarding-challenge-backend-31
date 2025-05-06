package org.example.preassignment.product.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter @Setter
//@ToString
public class ProductOption {
    private Long id;
    private Long optionGroupId;
    private String name;
    private BigDecimal additionalPrice;  // default 0
    private String sku;
    private int stock;  // default 0
    private int displayOrder;  // default 0
}