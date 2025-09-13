package com.example.EventsApp.controller;

import com.example.EventsApp.dto.Participant;
import com.example.EventsApp.service.ParticipantService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Participants")
public class ParticipantController {

    private final ParticipantService participantService;

    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    public List<Participant> getAllParticipants() {
       return participantService.getAllParticipants();
    }
}
