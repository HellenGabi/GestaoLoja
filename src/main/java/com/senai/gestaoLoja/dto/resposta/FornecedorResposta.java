package com.senai.gestaoLoja.dto.resposta;

import jakarta.validation.constraints.NotBlank;

public record FornecedorResposta(

        Long id,
        String nome,
        String cnpj,
        String email,
        String telefone
) {
}
