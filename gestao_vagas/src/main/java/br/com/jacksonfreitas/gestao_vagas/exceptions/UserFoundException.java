package br.com.jacksonfreitas.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
  public UserFoundException(){
    super("Usuário já existe");
  }
}

//Esta classe possui um método que herda RuntimeException
//É possível personalizar a mensagem da exception chamando o construtor da classe pai no super;
