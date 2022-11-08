package com.sha.springbootdevceseller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sha.springbootdevceseller.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {

}
