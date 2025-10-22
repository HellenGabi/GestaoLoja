package com.senai.gestaoLoja.service;

import com.senai.gestaoLoja.dto.requisicao.ProdutoRequisicao;
import com.senai.gestaoLoja.dto.resposta.ProdutoResposta;
import com.senai.gestaoLoja.exception.produtoExiste;
import com.senai.gestaoLoja.exception.produtoNaoExiste;
import com.senai.gestaoLoja.mapper.ProdutoMapper;
import com.senai.gestaoLoja.model.Produto;
import com.senai.gestaoLoja.repository.ProdutoDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutoDAO dao;
    private final ProdutoMapper mapper;

    public ProdutoResposta salvarProduto( ProdutoRequisicao produtoRequisicao) {

        if (dao.existsByNome(produtoRequisicao.nome())){
            throw new produtoExiste();
        }
        return mapper.paraResposta(dao.save(mapper.paraEntidade(produtoRequisicao)));

    }

    public List<ProdutoResposta> buscarProduto() {
        return dao.findAll().stream()
                .map(mapper::paraResposta)
                .toList();
    }

    public ProdutoResposta buscarPorId(Long id) {
        Produto produto = dao.findById(id).orElseThrow(() ->
                new produtoNaoExiste());
        return mapper.paraResposta(produto);
    }

    public ProdutoResposta atualizarProduto(Long id, ProdutoRequisicao produtoRequisicao) {
        Produto produto = dao.findById(id).orElseThrow(() ->
                new produtoNaoExiste());

        Produto newProduto = mapper.paraUpdate(produtoRequisicao, produto);
        dao.save(newProduto);
        return mapper.paraResposta(newProduto);
    }

    public ProdutoResposta deletarProduto(Long id) {
        Produto produto = dao.findById(id).orElseThrow(() ->
                new produtoNaoExiste());

        dao.deleteById(id);

        return mapper.paraResposta(produto);
    }
}



