package com.example.EventsApp.exception;

public class RequiredArgumentsNotSpecifiedException extends RuntimeException {
    public RequiredArgumentsNotSpecifiedException(String message) {
        super("Arguments with asterisk require filling");
    }
}
