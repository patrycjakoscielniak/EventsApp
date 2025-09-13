package com.example.EventsApp.mapper;

import com.example.EventsApp.dto.Event;
import com.example.EventsApp.dto.Location;
import com.example.EventsApp.entity.EventEntity;
import com.example.EventsApp.entity.LocationEntity;

public class EventMapper {

    public static EventEntity toEntity(Event event) {
        Location location = event.getEventLocation();
        return new EventEntity(
                event.getId(),
                event.getEventName(),
                event.getEventDescription(),
                event.getEventDate(),
                event.getEventCapacity(),
                new LocationEntity(
                        location.getId(),
                        location.getLocationName(),
                        location.getCity(),
                        location.getAddress()));
    }

    public static Event toDto(EventEntity entity) {
        LocationEntity location = entity.getEventLocation();
        return new Event(
                entity.getId(),
                entity.getEventName(),
                entity.getEventDescription(),
                entity.getEventDate(),
                entity.getEventCapacity(),
                new Location(
                        location.getId(),
                        location.getLocationName(),
                        location.getCity(),
                        location.getAddress()));
    }
}
