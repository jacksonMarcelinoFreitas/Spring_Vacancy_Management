package br.com.jacksonfreitas.gestao_vagas.modules.company.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jacksonfreitas.gestao_vagas.modules.company.entities.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {
  Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);

  Optional<CompanyEntity> findByUsername(String username);
}

//cria-se o optional para ter acesso as funçoes que o java trás pra gente
