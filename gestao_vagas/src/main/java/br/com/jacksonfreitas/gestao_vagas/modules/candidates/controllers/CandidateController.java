package br.com.jacksonfreitas.gestao_vagas.modules.candidates.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.jacksonfreitas.gestao_vagas.modules.candidates.entities.CandidateEntity;
import br.com.jacksonfreitas.gestao_vagas.modules.candidates.useCases.CreateCandidateUseCase;
import br.com.jacksonfreitas.gestao_vagas.modules.candidates.useCases.ProfileCandidateUseCase;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/candidate")
public class CandidateController {

  //Inversão de Controle (IOC) gerenciado pelo spring framework, aplicado por meio da injeção de dependência;
  @Autowired
  private CreateCandidateUseCase createCandidateUseCase;

  @Autowired
  private ProfileCandidateUseCase profileCandidateUseCase;

  //As informações que encontrar em body devem passar pelo entity;
  //o retorno da classe necessita ter o mesmo tipo da classe
  @PostMapping("/")
  public ResponseEntity<Object> create(@Valid @RequestBody CandidateEntity candidateEntity){
    try {
      var result = this.createCandidateUseCase.execute(candidateEntity);
      return ResponseEntity.ok().body(result);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

  @GetMapping("/")    
  public ResponseEntity<Object> get(HttpServletRequest request ){

    var idCandidate = request.getAttribute("candidate_id");

    try {
      var profile = this.profileCandidateUseCase.execute(UUID.fromString(idCandidate.toString()));
      return ResponseEntity.ok().body(profile);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}

//os controllers não possui a responsabilidade de fazer validações, portanto estas são feitas em na camada de useCases(service)
//CreateCandidateUseCase é utilizada aqui via injeção de dependência;
//ResponseEntity<Object> retorna qualquer Objeto
//@Valid faz a validação de dados definidos no Entity
