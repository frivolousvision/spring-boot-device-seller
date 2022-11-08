package com.sha.springbootdevceseller.repository.projection;

import java.time.LocalDateTime;

import com.sha.springbootdevceseller.model.DeviceType;

public interface PurchaseItem {
    String getName();

    DeviceType getType();

    Double getPrice();

    String getColor();

    LocalDateTime getPurchaseTime();
}
