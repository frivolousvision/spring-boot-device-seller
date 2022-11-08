package com.sha.springbootdevceseller.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sha.springbootdevceseller.model.Purchase;
import com.sha.springbootdevceseller.repository.PurchaseRepository;
import com.sha.springbootdevceseller.repository.projection.PurchaseItem;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);

    }

    @Override
    public List<PurchaseItem> findAllPurchasesOfUser(Long userId) {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }

}
