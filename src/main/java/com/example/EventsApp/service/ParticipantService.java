package com.example.EventsApp.service;

import com.example.EventsApp.dto.Participant;
import com.example.EventsApp.mapper.ParticipantMapper;
import com.example.EventsApp.repository.ParticipantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParticipantService {

    private final ParticipantRepository participantRepository;

    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    public List<Participant> getAllParticipants() {
        return participantRepository.findAll()
                .stream()
                .map(ParticipantMapper::toDto)
                .collect(Collectors.toList());
    }
}
