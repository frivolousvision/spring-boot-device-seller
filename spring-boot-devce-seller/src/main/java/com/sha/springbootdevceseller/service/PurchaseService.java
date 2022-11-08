package com.sha.springbootdevceseller.service;

import java.util.List;

import com.sha.springbootdevceseller.model.Purchase;
import com.sha.springbootdevceseller.repository.projection.PurchaseItem;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findAllPurchasesOfUser(Long userId);
}
