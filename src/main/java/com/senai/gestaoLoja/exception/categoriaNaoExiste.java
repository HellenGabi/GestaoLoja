package com.senai.gestaoLoja.exception;

public class categoriaNaoExiste extends RuntimeException{

    public categoriaNaoExiste(){
        super("Produto não encontrado!");
    }
}

