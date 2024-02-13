package br.com.jacksonfreitas.gestao_vagas.exceptions;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor //vai criar um construtor com argumentos
public class ErrorMessageDTO {

  private String message;
  private String field;

}
