package com.example.EventsApp.dto;

import com.example.EventsApp.entity.RegistrationEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Event {
    private Long id;
    private String eventName;
    private String eventDescription;
    private LocalDate eventDate;
    private int eventCapacity;
    private Location eventLocation;
    private Set<Registration> registrations;
}
