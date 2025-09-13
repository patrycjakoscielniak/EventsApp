package com.example.EventsApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Participant {
    Long id;
    String name;
    String email;
    Set<Registration> registeredEvents;
}
