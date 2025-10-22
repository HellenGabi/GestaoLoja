package com.senai.gestaoLoja.dto.requisicao;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
@Validated
public record ClienteRequisicao(
        @NotBlank(message = "O nome informado está inválido!")
        String nome,

        @NotBlank(message = "O email informado está inválido!")
        String email,

        @NotBlank(message = "O telefone fornecido está inválido!")
        String telefone,

        @NotBlank(message = "O cpf fornecido está inválido!")
        String cpf

) {
}
