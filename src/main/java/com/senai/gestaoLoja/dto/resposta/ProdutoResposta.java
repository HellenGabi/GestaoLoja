package com.senai.gestaoLoja.dto.resposta;

public record ProdutoResposta (
        int id,
        String nome,
        String descricao,
        double preco,
        int quantidade
){

}
