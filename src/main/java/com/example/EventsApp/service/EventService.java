package com.example.EventsApp.service;

import com.example.EventsApp.dto.Event;
import com.example.EventsApp.entity.EventEntity;
import com.example.EventsApp.entity.LocationEntity;
import com.example.EventsApp.exception.EventNotFoundException;
import com.example.EventsApp.mapper.EventMapper;
import com.example.EventsApp.repository.EventRepository;
import com.example.EventsApp.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final LocationRepository locationRepository;

    public EventService(EventRepository eventRepository, LocationRepository locationRepository) {
        this.eventRepository = eventRepository;
        this.locationRepository = locationRepository;
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

        LocationEntity location = entity.getEventLocation();
        if (location != null && location.getId() == null) {
            location = locationRepository.save(location);
            entity.setEventLocation(location);
        }

        return EventMapper.toDto(eventRepository.save(entity));
    }

    public Event updateEvent(Long id, Event updateEvent) {
        EventEntity entity = getEventEntityById(id);
        if (updateEvent.getEventName() != null)
            entity.setEventName(updateEvent.getEventName());
        if (updateEvent.getEventDescription() != null)
            entity.setEventDescription(updateEvent.getEventDescription());
        if (updateEvent.getEventDate() != null)
            entity.setEventDate(updateEvent.getEventDate());
        if (updateEvent.getEventCapacity() > 0)
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
