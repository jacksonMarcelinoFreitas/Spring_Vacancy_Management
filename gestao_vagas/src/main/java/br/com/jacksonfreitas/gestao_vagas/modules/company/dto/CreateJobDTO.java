package br.com.jacksonfreitas.gestao_vagas.modules.company.dto;

import lombok.Data;

@Data
public class CreateJobDTO {
    
    private String description;
    private String benefits;
    private String level;

}

/*
    criou-se um novo DTO para que fosse protegido a criação de job
    job ao ser criado aceitará três args enquanto que o id virá pelo auth
*/
