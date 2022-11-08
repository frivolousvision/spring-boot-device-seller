package com.sha.springbootdevceseller.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sha.springbootdevceseller.model.Device;
import com.sha.springbootdevceseller.repository.DeviceRepository;

@Service
public class DeviceServiceImpl implements DeviceService {

    private final DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public Device saveDevice(Device device) {
        device.setCreateTime(LocalDateTime.now());

        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Long id) {
        deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllDevices() {
        return deviceRepository.findAll();
    }
}
