package com.senai.gestaoLoja.dto.resposta;

import jakarta.persistence.Column;

public record ClienteResposta (

        Long id,

 String nome,


 String email,


 String telefone,


 String cpf
){
}
