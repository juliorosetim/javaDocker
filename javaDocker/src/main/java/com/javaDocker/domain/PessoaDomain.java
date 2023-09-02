package com.javaDocker.domain;


import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="pessoa")
@Data
public class PessoaDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nomé é obrigatório")
    private String nome;

    private String cnpjcpf;

    private String telefone;
}
