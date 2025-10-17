package com.senai.gestaoLoja.dto.requisicao;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public record ProdutoRequisicao(

    @NotBlank(message = "O nome está inválido!")
    String nome,

    @NotBlank(message = "A descrição está inválida!")
    String descicao,

    @NotBlank(message = "O preço está inválido!")
    double preco,

    @NotBlank(message = "A quantidade está inválida!")
    int quantidade
) {
}
