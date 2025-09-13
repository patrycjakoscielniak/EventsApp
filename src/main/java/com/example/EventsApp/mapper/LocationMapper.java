package com.example.EventsApp.mapper;

import com.example.EventsApp.dto.Location;
import com.example.EventsApp.entity.LocationEntity;

public class LocationMapper {

    public static Location toDto(LocationEntity entity) {
        return new Location(entity.getId(), entity.getLocationName(), entity.getCity(), entity.getAddress());
    }

    public static LocationEntity toEntity(Location dto) {
        return new LocationEntity(dto.getId(), dto.getLocationName(), dto.getCity(), dto.getAddress());
    }
}
