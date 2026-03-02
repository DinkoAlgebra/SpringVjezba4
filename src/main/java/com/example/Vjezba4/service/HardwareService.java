package com.example.Vjezba4.service;

import com.example.Vjezba4.dto.HardwareDTO;

import java.util.List;
import java.util.Optional;

public interface HardwareService {

    List<HardwareDTO> findAll();

    Optional<HardwareDTO> findByCode(String code);

    Optional<HardwareDTO> save(HardwareDTO hardwareDTO);

    Optional<HardwareDTO> update(String code, HardwareDTO updatedHardwareDTO);

    void deleteByCode(String code);

}
