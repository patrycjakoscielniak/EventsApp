package com.example.EventsApp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    @Column(name = "event_name")
    String eventName;
    @Column(name = "event_description")
    String eventDescription;
    @NotNull
    @Future
    @Column(name = "event_date")
    LocalDate eventDate;
    @Min(1)
    @Column(name = "event_capacity")
    int eventCapacity;
    @ManyToOne
    @JoinColumn(name = "location_id")
    LocationEntity eventLocation;

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
