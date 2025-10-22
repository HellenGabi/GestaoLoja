package com.senai.gestaoLoja.mapper;

import com.senai.gestaoLoja.dto.requisicao.CategoriaRequisicao;
import com.senai.gestaoLoja.dto.requisicao.ProdutoRequisicao;
import com.senai.gestaoLoja.model.Categoria;
import com.senai.gestaoLoja.model.Produto;

public class CategoriaMapper {

    public Categoria paraEntidade(CategoriaRequisicao categoriaRequisicao){
        return new Categoria(categoriaRequisicao.nome(), categoriaRequisicao.descricao());
    }

    public CategoriaRequisicao paraResposta(Categoria categoria){
        return new CategoriaRequisicao(categoria.getId(), categoria.getNome(), categoria.getDescricao());
    }

    public Categoria paraUpdate(CategoriaRequisicao categoriaRequisicao, Categoria categoria){
        if((categoriaRequisicao.nome() != categoria.getNome() && categoriaRequisicao.nome() != null)){
            categoria.setNome(categoriaRequisicao.nome());
        }
        if((categoriaRequisicao.descricao() != categoria.getDescricao() && categoriaRequisicao.descricao() !=null)){
            categoria.setDescricao(categoriaRequisicao.descricao());
        }
        return categoria;
    }
}
