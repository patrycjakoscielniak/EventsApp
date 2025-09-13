package com.example.EventsApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {
    Long id;
    Event event;
    LocalDate registrationDate;

    @Override
    public String toString() {
        return "Registration{" +
                "event=" + event +
                ", id=" + id +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
