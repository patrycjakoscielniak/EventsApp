package com.example.EventsApp.mapper;

import com.example.EventsApp.dto.Event;
import com.example.EventsApp.dto.Registration;
import com.example.EventsApp.entity.EventEntity;
import com.example.EventsApp.entity.RegistrationEntity;

public class RegistrationMapper {

    public static RegistrationEntity toEntity(Registration dto) {
        EventEntity event = EventMapper.toEntity(dto.getEvent());
        return new RegistrationEntity(dto.getId(), event, dto.getRegistrationDate());
    }

    public static Registration toDto(RegistrationEntity entity) {
        Event event = EventMapper.toDto(entity.getEvent());
        return new Registration(entity.getId(), event, entity.getRegistrationDate());
    }
}
