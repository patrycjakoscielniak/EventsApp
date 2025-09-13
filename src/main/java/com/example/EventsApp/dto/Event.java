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
    public String eventName;
    public String eventDescription;
    public LocalDate eventDate;
    public int eventCapacity;

}
