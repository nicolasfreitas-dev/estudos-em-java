package javacore.Oexception.exceptions.domain;

// PARA UTILIZAR EXPECTIONS CUSTOMIZADAS BASTA EXTENDER A CLASSE EXCEPTION

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
