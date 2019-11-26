package com.darksiders.hbsis.exception;

public class CadastroException extends Exception {

    private static final long serialVersionUID = 1L;

    public CadastroException() {
    }

    public CadastroException(String mensagem) {
        super(mensagem);
    }

    public CadastroException(Throwable causa) {
        super(causa);
    }

    public CadastroException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
