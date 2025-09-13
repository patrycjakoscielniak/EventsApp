package com.example.EventsApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "events")
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "event_name")
    String eventName;
    @Column(name = "event_description")
    String eventDescription;
    @Column(name = "event_date")
    LocalDate eventDate;
    @Column(name = "event_capacity")
    int eventCapacity;

    @Override
    public String toString() {
        return "EventEntity{" +
                "name=" + eventName +
                ", id=" + id +
                ", date='" + eventDate + '\'' +
                ", description='" + eventDescription + '\'' +
                ", capacity=" + eventCapacity +
                '}';
    }
}
