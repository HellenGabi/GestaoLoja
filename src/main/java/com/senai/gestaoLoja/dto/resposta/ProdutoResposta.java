package com.senai.gestaoLoja.dto.resposta;

import java.math.BigDecimal;

public record ProdutoResposta (
        Long id,
        String nome,
        String descricao,
        BigDecimal preco,
        int quantidade
){

}
