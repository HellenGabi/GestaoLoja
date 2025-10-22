package com.senai.gestaoLoja.service;


import com.senai.gestaoLoja.dto.requisicao.CategoriaRequisicao;
import com.senai.gestaoLoja.exception.categoriaNaoExiste;
import com.senai.gestaoLoja.exception.produtoExiste;
import com.senai.gestaoLoja.mapper.CategoriaMapper;
import com.senai.gestaoLoja.model.Categoria;
import com.senai.gestaoLoja.repository.CategoriaDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaService {

    private final CategoriaDAO dao;
    private final CategoriaMapper mapper;

    public CategoriaRequisicao salvarProduto(CategoriaRequisicao categoriaRequisicao) {

        if (dao.existsByNome(categoriaRequisicao.nome())){
            throw new produtoExiste();
        }
        return mapper.paraResposta(dao.save(mapper.paraEntidade(categoriaRequisicao)));

    }

    public List<CategoriaRequisicao> buscarProduto() {
        return dao.findAll().stream()
                .map(mapper::paraResposta)
                .toList();
    }

    public CategoriaRequisicao atualizarProduto(Long id, CategoriaRequisicao categoriaRequisicao) {
        Categoria categoria = dao.findById(id).orElseThrow(() ->
                new categoriaNaoExiste());

        Categoria newCategoria = mapper.paraUpdate(categoriaRequisicao, categoria);
        dao.save(newCategoria);
        return mapper.paraResposta(newCategoria);
    }

    public CategoriaRequisicao deletarProduto(Long id) {
        Categoria categoria = dao.findById(id).orElseThrow(() ->
                new categoriaNaoExiste());

        dao.deleteById(id);

        return mapper.paraResposta(categoria);
    }


}
