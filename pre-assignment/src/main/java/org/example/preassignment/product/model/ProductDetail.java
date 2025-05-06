package org.example.preassignment.product.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Map;

@Getter @Setter
@ToString
public class ProductDetail {
    private Long id;
    private Long productId;
    private BigDecimal weight;
    private Dimensions dimensions;
    private String materials;
    private String countryOfOrigin;
    private String warrantyInfo;
    private String careInstructions;
    private Map<String, Object> additionalInfo; // JSONB: Map + JsonTypeHandler
    // private String additionalInfo;      // JSONB -> String으로 저장 가능 (필요 시 JSON 파싱)

    // 내부 클래스는 static 권장 <- '숨은 외부 참조'
    // 내부 클래스가 외부 클래스를 참조(숨은 외부 참조)하기 때문에 
    // GC 대상이 되지 못해서 메모리 누수 발생
    public static class Dimensions {
        private String width;
        private String height;
        private String depth;
    }
}
