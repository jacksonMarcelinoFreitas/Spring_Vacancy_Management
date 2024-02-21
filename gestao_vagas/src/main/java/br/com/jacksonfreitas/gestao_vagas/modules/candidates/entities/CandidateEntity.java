//classe reponsável por receber os dados vindos das requisiçoes;
package br.com.jacksonfreitas.gestao_vagas.modules.candidates.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Email;
import lombok.Data; //adiciona os getters and setter a todos os atributos

@Data
@Entity(name = "candidate")
public class CandidateEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID) //ao criar o dado cria-se o id
  private UUID id;
  private String name;

  @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaços.")
  private String username;

  @Email(message = "O campo [email] deve conter um e-mail válido.")
  private String email;

  @Length(min = 8, max = 200, message = "A senha deve conter entre 8 e 20 carcteres.")
  private String password;

  private String description;
  private String resume;

  @CreationTimestamp
  private LocalDateTime createdAt;

}

//Esta camada representa a instancia de candidato com seus atributos e métodos;
