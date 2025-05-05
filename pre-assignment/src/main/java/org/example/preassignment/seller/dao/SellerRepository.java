package org.example.preassignment.seller.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.preassignment.seller.model.Seller;

@Mapper
public interface SellerRepository {
    Seller getSellerInfo(Long sellerId);
}
