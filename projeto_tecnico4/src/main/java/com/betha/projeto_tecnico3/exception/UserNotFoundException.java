package com.betha.projeto_tecnico3.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String mensagem) {
        super(mensagem);
    }
}
