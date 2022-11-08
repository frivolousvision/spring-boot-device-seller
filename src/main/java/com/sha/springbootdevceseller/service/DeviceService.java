package com.sha.springbootdevceseller.service;

import java.util.List;

import com.sha.springbootdevceseller.model.Device;

public interface DeviceService {
    Device saveDevice(Device device);

    void deleteDevice(Long id);

    List<Device> findAllDevices();
}
