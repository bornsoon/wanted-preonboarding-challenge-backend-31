package org.example.preassignment.product.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Map;

@Getter @Setter
//@ToString
public class ProductPrice {
    private Long id;
    private Long productId;
    private BigDecimal basePrice;
    private BigDecimal salePrice;
    private BigDecimal costPrice;
    private String materials;
    private String currency;  // default "KRW"
    private BigDecimal taxRate;
}