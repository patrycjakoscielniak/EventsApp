package com.example.EventsApp.repository;

import com.example.EventsApp.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Long> {
}
