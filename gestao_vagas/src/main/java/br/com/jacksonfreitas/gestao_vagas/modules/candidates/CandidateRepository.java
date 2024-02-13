package br.com.jacksonfreitas.gestao_vagas.modules.candidates;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

  Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);

}

// Esta camada fornece acesso aos dados de candidatos
// JPARepository fornece métodos para acessar dados do banco de dados relacional
// a camada repository é uma camada de comunicação com o banco de dados, esta extende os métodos JpaRepository que por sua vez possui os métodos necessários para a manipulação de dados como ORM
