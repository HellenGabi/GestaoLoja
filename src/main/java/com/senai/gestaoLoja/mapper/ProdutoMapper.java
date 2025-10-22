package com.senai.gestaoLoja.mapper;

import com.senai.gestaoLoja.dto.requisicao.ProdutoRequisicao;
import com.senai.gestaoLoja.dto.resposta.ProdutoResposta;
import com.senai.gestaoLoja.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {


    public Produto paraEntidade(ProdutoRequisicao produtoRequisicao){
        return new Produto(produtoRequisicao.nome(), produtoRequisicao.descricao(), produtoRequisicao.valor(), produtoRequisicao.quantidade());
    }
    public ProdutoResposta paraResposta(Produto produto){
        return new ProdutoResposta(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getValor(), produto.getQuantidade());
    }

    public Produto paraUpdate(ProdutoRequisicao produtoRequisicao, Produto produto){
        if((produtoRequisicao.nome() != produto.getNome() && produtoRequisicao.nome() != null)){
            produto.setNome(produtoRequisicao.nome());
        }
        if((produtoRequisicao.descricao() != produto.getDescricao() && produtoRequisicao.descricao() !=null)){
            produto.setDescricao(produtoRequisicao.descricao());
        }
        return produto;
    }
}
