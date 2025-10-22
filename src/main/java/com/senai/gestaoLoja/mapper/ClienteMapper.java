package com.senai.gestaoLoja.mapper;

import com.senai.gestaoLoja.dto.requisicao.ClienteRequisicao;
import com.senai.gestaoLoja.dto.resposta.ClienteResposta;
import com.senai.gestaoLoja.model.Cliente;

public class ClienteMapper {

    public Cliente paraEntidade(ClienteRequisicao clienteRequisicao){
        return new Cliente(clienteRequisicao.nome(), clienteRequisicao.email(), clienteRequisicao.telefone(), clienteRequisicao.cpf());
    }

    public ClienteResposta paraResposta(Cliente cliente){
        return new ClienteResposta(cliente.getId(), cliente.getNome(),cliente.getEmail(), cliente.getTelefone(), cliente.getCpf());
    }
}
