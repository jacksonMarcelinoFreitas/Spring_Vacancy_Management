package br.com.jacksonfreitas.gestao_vagas.modules.candidates.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jacksonfreitas.gestao_vagas.modules.candidates.entities.CandidateEntity;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

  Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);
  Optional<CandidateEntity> findByUsername(String username);

}

// Esta camada fornece acesso aos dados de candidatos
// JPARepository fornece métodos para acessar dados do banco de dados relacional
// a camada repository é uma camada de comunicação com o banco de dados, esta extende os métodos JpaRepository que por sua vez possui os métodos necessários para a manipulação de dados como ORM
