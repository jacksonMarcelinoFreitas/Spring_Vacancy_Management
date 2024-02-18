package br.com.jacksonfreitas.gestao_vagas.modules.company.dto;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class AuthCompanyDTO {
    
    private String password;
    private String username;

}

// um data tranfer object trás somente as informações necessárias para a authenticação
// AllArgsContructor faz um construtor com os atributos
