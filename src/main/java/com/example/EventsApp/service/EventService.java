package com.example.EventsApp.service;

import com.example.EventsApp.dto.Event;
import com.example.EventsApp.entity.EventEntity;
import com.example.EventsApp.exception.EventNotFoundException;
import com.example.EventsApp.mapper.EventMapper;
import com.example.EventsApp.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll()
                .stream()
                .map(EventMapper::toDto)
                .collect(Collectors.toList());
    }

    public Event getEventById(Long id) {
        EventEntity entity = getEventEntityById(id);
        return EventMapper.toDto(entity);
    }

    public Event addEvent(Event event) {
        EventEntity entity = EventMapper.toEntity(event);
        EventEntity saved = eventRepository.save(entity);
        return EventMapper.toDto(saved);
    }

    public Event updateEvent(Long id, Event updateEvent) {
        EventEntity entity = getEventEntityById(id);
        entity.setEventName(updateEvent.getEventName());
        entity.setEventDescription(updateEvent.getEventDescription());
        entity.setEventDate(updateEvent.getEventDate());
        entity.setEventCapacity(updateEvent.getEventCapacity());
        return EventMapper.toDto(eventRepository.save(entity));
    }
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public EventEntity getEventEntityById(Long id) {
        return eventRepository.findById(id).orElseThrow(() -> new EventNotFoundException(id));
    }
}
