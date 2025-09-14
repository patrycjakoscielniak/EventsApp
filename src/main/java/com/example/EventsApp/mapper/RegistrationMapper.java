package com.example.EventsApp.mapper;

import com.example.EventsApp.dto.Event;
import com.example.EventsApp.dto.Participant;
import com.example.EventsApp.dto.Registration;
import com.example.EventsApp.entity.EventEntity;
import com.example.EventsApp.entity.ParticipantEntity;
import com.example.EventsApp.entity.RegistrationEntity;

public class RegistrationMapper {

    public static RegistrationEntity toEntity(Registration dto) {
        EventEntity event = EventMapper.toEntity(dto.getEvent());
        ParticipantEntity participant = ParticipantMapper.toEntity(dto.getParticipant());
        return new RegistrationEntity(dto.getId(), event, participant, dto.getRegistrationDate());
    }

    public static Registration toDto(RegistrationEntity entity) {
        Event event = EventMapper.toDto(entity.getEvent());
        Participant participant = ParticipantMapper.toDto(entity.getParticipant());
        return new Registration(entity.getId(), event, participant, entity.getRegistrationDate());
    }
}
