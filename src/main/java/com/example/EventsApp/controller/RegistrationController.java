package com.example.EventsApp.controller;

import com.example.EventsApp.dto.Registration;
import com.example.EventsApp.service.RegistrationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Registration")
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    public Registration register(@RequestBody Registration registration) {
        return registrationService.register(registration);
    }

    @DeleteMapping("/{id}")
    public void unregister(@PathVariable Long id) {
        registrationService.unregister(id);
    }
}
