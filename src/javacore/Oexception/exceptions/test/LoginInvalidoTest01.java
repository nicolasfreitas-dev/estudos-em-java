package javacore.Oexception.exceptions.test;

import javacore.Oexception.exceptions.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            Logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void Logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);

        String usernameDB = "Goku";
        String passwordDB = "1234";

        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String passwordDigitado = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Usuário ou Senha inválidos!");
        }

        System.out.println("Usuário logado com sucesso!");

        teclado.close();
    }
}
