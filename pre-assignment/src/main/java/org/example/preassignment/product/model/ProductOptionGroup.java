package org.example.preassignment.product.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
//@ToString
public class ProductOptionGroup {
    private Long id;
    private Long productId;
    private String name;
    private int displayOrder;  // default 0
}