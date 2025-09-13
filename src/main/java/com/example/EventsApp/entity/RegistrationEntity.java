package com.example.EventsApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "registrations")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RegistrationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "event_id")
    EventEntity event;
    LocalDate registrationDate;

    @Override
    public String toString() {
        return "RegistrationEntity{" +
                "event=" + event +
                ", id=" + id +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
