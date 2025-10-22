package com.senai.gestaoLoja.dto.requisicao;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public record FornecedorRequisicao(

        @NotBlank(message = "Insira um nome válido!")
        String nome,

        @NotBlank(message = "Inisira um CNPJ válido!")
        String cnpj,

        @NotBlank(message = "Insira um email válido!")
        String email,

        @NotBlank(message = "Insira um telefone válido!")
        String telefone

) {
}
