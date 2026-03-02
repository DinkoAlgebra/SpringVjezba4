package com.example.Vjezba4.service;

import com.example.Vjezba4.domain.Hardware;
import com.example.Vjezba4.dto.HardwareDTO;
import com.example.Vjezba4.repository.HardwareRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HardwareServiceImpl implements HardwareService{

    private final HardwareRepository hardwareRepository;

    public HardwareServiceImpl(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }

    @Override
    public List<HardwareDTO> findAll() {
        return hardwareRepository.findAll().stream().map(HardwareDTO::new).collect(Collectors.toList());
    }

    @Override
    public Optional<HardwareDTO> findByCode(String code) {
        return hardwareRepository.findByCode(code).map(HardwareDTO::new);
    }

    @Override
    public Optional<HardwareDTO> save(HardwareDTO hardwareDTO) {
        return hardwareRepository
                .save(new Hardware(hardwareDTO))
                .map(HardwareDTO::new);
    }

    @Override
    public Optional<HardwareDTO> update(String code, HardwareDTO updatedHardwareDTO) {
        return hardwareRepository
                .update(code, new Hardware(updatedHardwareDTO))
                .map(HardwareDTO::new);
    }

    @Override
    public void deleteByCode(String code) {
        hardwareRepository.deleteByCode(code);
    }
}
