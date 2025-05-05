package org.example.preassignment.seller.service;

import org.example.preassignment.seller.dao.SellerRepository;
import org.example.preassignment.seller.model.Seller;

public class BasicSellerService implements SellerService {

    private final SellerRepository sellerRepository;

    public BasicSellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public Seller getSellerInfo(Long sellerId) {
        return sellerRepository.getSellerInfo(sellerId);
    }
}
