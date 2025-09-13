package com.example.EventsApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Location {
    Long id;
    String locationName;
    String city;
    String address;
}
