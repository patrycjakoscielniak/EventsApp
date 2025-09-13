package com.example.EventsApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
}
