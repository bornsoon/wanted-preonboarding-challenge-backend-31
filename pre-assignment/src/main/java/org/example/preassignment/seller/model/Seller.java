package org.example.preassignment.seller.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter @Setter
@ToString
public class Seller {
    private Long id;
    private String name;
    private String description;
    private String logoUrl;
    private float rating;
    private String contactEmail;
    private String contactPhone;

    // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
}
