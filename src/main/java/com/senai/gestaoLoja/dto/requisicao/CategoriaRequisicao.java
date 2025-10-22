package com.senai.gestaoLoja.dto.requisicao;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public record CategoriaRequisicao (
        Long id, @NotBlank(message = "O nome informado está inválido!")
        String nome,

        @NotBlank(message = "A descricao informada está inválida!")
        String descricao

){
}
