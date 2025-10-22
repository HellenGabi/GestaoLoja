package com.senai.gestaoLoja.mapper;

import com.senai.gestaoLoja.dto.requisicao.CategoriaRequisicao;
import com.senai.gestaoLoja.model.Categoria;

public class CategoriaMapper {

    public Categoria paraEntidade(CategoriaRequisicao categoriaRequisicao){
        return new Categoria(categoriaRequisicao.nome(), categoriaRequisicao.descricao());
    }

    public CategoriaRequisicao paraResposta(Categoria categoria){
        return new CategoriaRequisicao(categoria.getId(), categoria.getNome(), categoria.getDescricao());
    }
}
