package com.example.EventsApp.mapper;

import com.example.EventsApp.dto.Event;
import com.example.EventsApp.dto.Location;
import com.example.EventsApp.entity.EventEntity;
import com.example.EventsApp.entity.LocationEntity;

public class EventMapper {

    public static EventEntity toEntity(Event event) {
        LocationEntity locationEntity = LocationMapper.toEntity(event.getEventLocation());
        return new EventEntity(
                event.getId(),
                event.getEventName(),
                event.getEventDescription(),
                event.getEventDate(),
                event.getEventCapacity(),
                locationEntity);
    }

    public static Event toDto(EventEntity entity) {
        Location location = LocationMapper.toDto(entity.getEventLocation());
        return new Event(
                entity.getId(),
                entity.getEventName(),
                entity.getEventDescription(),
                entity.getEventDate(),
                entity.getEventCapacity(),
                location);
    }
}
