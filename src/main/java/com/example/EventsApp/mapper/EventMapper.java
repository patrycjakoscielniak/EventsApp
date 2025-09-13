package com.example.EventsApp.mapper;

import com.example.EventsApp.dto.Event;
import com.example.EventsApp.dto.Location;
import com.example.EventsApp.dto.Registration;
import com.example.EventsApp.entity.EventEntity;
import com.example.EventsApp.entity.LocationEntity;
import com.example.EventsApp.entity.RegistrationEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class EventMapper {

    public static EventEntity toEntity(Event event) {
        LocationEntity locationEntity = LocationMapper.toEntity(event.getEventLocation());
        Set<RegistrationEntity> registrations = event
                .getRegistrations()
                .stream()
                .map(RegistrationMapper::toEntity)
                .collect(Collectors.toSet());
        return new EventEntity(
                event.getId(),
                event.getEventName(),
                event.getEventDescription(),
                event.getEventDate(),
                event.getEventCapacity(),
                locationEntity,
                registrations);
    }

    public static Event toDto(EventEntity entity) {
        Location location = LocationMapper.toDto(entity.getEventLocation());
        Set<Registration> registrations = entity
                .getRegistrations()
                .stream()
                .map(RegistrationMapper::toDto)
                .collect(Collectors.toSet());
        return new Event(
                entity.getId(),
                entity.getEventName(),
                entity.getEventDescription(),
                entity.getEventDate(),
                entity.getEventCapacity(),
                location,
                registrations);
    }
}
