package com.example.EventsApp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "locations")
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "location_name")
    @NotNull
    String locationName;
    @NotNull
    String city;
    String address;

    @Override
    public String toString() {
        return "Location{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", name='" + locationName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
