package com.example.EventsApp.mapper;

import com.example.EventsApp.dto.Participant;
import com.example.EventsApp.dto.Registration;
import com.example.EventsApp.entity.ParticipantEntity;
import com.example.EventsApp.entity.RegistrationEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class ParticipantMapper {

    public static ParticipantEntity toEntity(Participant dto) {
        Set<RegistrationEntity> registrated = dto.getRegisteredEvents()
                .stream()
                .map(RegistrationMapper::toEntity)
                .collect(Collectors.toSet());
        return new ParticipantEntity(dto.getId(), dto.getName(), dto.getEmail(), registrated);
    }

    public static Participant toDto(ParticipantEntity entity) {
        Set<Registration> registrated = entity.getRegisteredEvents()
                .stream()
                .map(RegistrationMapper::toDto)
                .collect(Collectors.toSet());
        return new Participant(entity.getId(), entity.getName(), entity.getEmail(), registrated);
    }
}
