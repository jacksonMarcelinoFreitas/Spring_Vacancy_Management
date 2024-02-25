package br.com.jacksonfreitas.gestao_vagas.modules.candidates.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.jacksonfreitas.gestao_vagas.modules.candidates.dto.ProfileCandidateResponseDTO;
import br.com.jacksonfreitas.gestao_vagas.modules.candidates.repositories.CandidateRepository;

@Service 
public class ProfileCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    public ProfileCandidateResponseDTO execute(UUID IdCandidate){
        var canditate = this.candidateRepository.findById(IdCandidate)
        .orElseThrow(() -> {
            throw new UsernameNotFoundException("User not found!");
        });

        var candidateDTO = ProfileCandidateResponseDTO.builder()
            .description(canditate.getDescription())
            .username(canditate.getUsername())
            .email(canditate.getEmail())
            .name(canditate.getName())
            .id(canditate.getId())
            .build();
        

        return candidateDTO;

    }
}
