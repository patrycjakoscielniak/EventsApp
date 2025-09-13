package com.example.EventsApp.exception;

public class EventNotFoundException extends RuntimeException{
    public EventNotFoundException(Long id) {
        super("Event with id: " + id + " could not be found");
    }

}
