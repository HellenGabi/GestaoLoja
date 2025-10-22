package com.senai.gestaoLoja.exception;

public class produtoExiste extends RuntimeException{

    public produtoExiste(){
        super("O produto já está cadastrado!");
    }
}
