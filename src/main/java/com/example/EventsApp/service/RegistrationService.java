package com.example.EventsApp.service;

import com.example.EventsApp.dto.Registration;
import com.example.EventsApp.entity.RegistrationEntity;
import com.example.EventsApp.mapper.RegistrationMapper;
import com.example.EventsApp.repository.RegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final RegistrationRepository registrationRepository;

    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public Registration register(Registration registration) {
        RegistrationEntity entity = RegistrationMapper.toEntity(registration);

        return RegistrationMapper.toDto(registrationRepository.save(entity));
    }

    public void unregister(Long id) {
        registrationRepository.deleteById(id);
    }
}
