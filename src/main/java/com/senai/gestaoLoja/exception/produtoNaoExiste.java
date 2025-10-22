package com.senai.gestaoLoja.exception;

public class produtoNaoExiste extends RuntimeException{

    public produtoNaoExiste(){
        super("Produto não encontrado!");
    }
}
