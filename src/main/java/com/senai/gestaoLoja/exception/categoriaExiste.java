package com.senai.gestaoLoja.exception;

public class categoriaExiste extends RuntimeException{

    public categoriaExiste(){
        super("O produto já está cadastrado!");
    }
}