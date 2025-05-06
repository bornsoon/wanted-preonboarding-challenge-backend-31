package org.example.preassignment.product.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
// @ToString
public class ProductImage {
    private Long id;
    private Long productId;
    private String url;
    private String altText;
    private boolean isPrimary;  // default false
    private int displayOrder;  // default 0
    private Long optionId;
}