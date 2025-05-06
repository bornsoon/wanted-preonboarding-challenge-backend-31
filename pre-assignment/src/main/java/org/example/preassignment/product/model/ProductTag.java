package org.example.preassignment.product.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter @Setter
//@ToString
public class ProductTag {
    private Long id;
    private Long productId;
    private Long tagId;
}