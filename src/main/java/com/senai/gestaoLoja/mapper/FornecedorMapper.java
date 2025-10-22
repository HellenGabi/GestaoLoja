package com.senai.gestaoLoja.mapper;

import com.senai.gestaoLoja.dto.requisicao.FornecedorRequisicao;
import com.senai.gestaoLoja.dto.resposta.FornecedorResposta;
import com.senai.gestaoLoja.model.Fornecedor;

public class FornecedorMapper {

    public Fornecedor paraEntidade(FornecedorRequisicao fornecedorRequisicao){
        return new Fornecedor(fornecedorRequisicao.nome(), fornecedorRequisicao.cnpj(), fornecedorRequisicao.email(), fornecedorRequisicao.telefone());
    }
    public FornecedorResposta paraResposta(Fornecedor fornecedor){
        return new FornecedorResposta(fornecedor.getId(), fornecedor.getNome(), fornecedor.getCnpj(), fornecedor.getEmail(), fornecedor.getTelefone());
    }
}
