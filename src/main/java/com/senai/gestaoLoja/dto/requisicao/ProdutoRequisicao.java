package com.senai.gestaoLoja.dto.requisicao;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

@Validated
public record ProdutoRequisicao(

    @NotBlank(message = "O nome está inválido!")
    String nome,

    @NotBlank(message = "A descrição está inválida!")
    String descricao,

    @NotBlank(message = "O preço está inválido!")
    BigDecimal valor,

    @NotBlank(message = "A quantidade está inválida!")
    int quantidade
) {
}
