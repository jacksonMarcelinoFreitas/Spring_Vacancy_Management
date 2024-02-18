package br.com.jacksonfreitas.gestao_vagas.modules.candidates.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jacksonfreitas.gestao_vagas.exceptions.UserFoundException;
import br.com.jacksonfreitas.gestao_vagas.modules.candidates.entities.CandidateEntity;
import br.com.jacksonfreitas.gestao_vagas.modules.candidates.repositories.CandidateRepository;

@Service
public class CreateCandidateUseCase {

  @Autowired
  private CandidateRepository candidateRepository;
  
  public CandidateEntity execute(CandidateEntity candidateEntity){
    this.candidateRepository
    .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
    .ifPresent((user) -> {
      throw new UserFoundException();
    });

    return this.candidateRepository.save(candidateEntity);

  }
}

// useCase é uma camada de serviço
// uma camada de serviço é reponsavel por fazer a execução de buscas, creates ... no banco de dados bem como validações e regras de DDL e DML no banco;
