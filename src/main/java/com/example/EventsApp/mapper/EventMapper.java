package com.example.EventsApp.mapper;

import com.example.EventsApp.dto.Event;
import com.example.EventsApp.entity.EventEntity;

public class EventMapper {

    public static EventEntity toEntity(Event event) {
        return new EventEntity(event.getId(), event.getEventName(), event.getEventDescription(), event.getEventDate(), event.eventCapacity);
    }

    public static Event toDto(EventEntity entity) {
        return new Event(entity.getId(), entity.getEventName(), entity.getEventDescription(), entity.getEventDate(), entity.getEventCapacity());
    }
}
