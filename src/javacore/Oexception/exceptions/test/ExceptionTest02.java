package javacore.Oexception.exceptions.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }
    
    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");

        try {
            boolean isCriado = file.createNewFile();

            System.out.println("Arquivo criado " + isCriado);

        } catch (IOException e) {
            e.printStackTrace();

            throw e;

            // OUTRA OPCAO É:
            // EX: throw new RuntimeException("Problema bla bla bla");
            // sem o throws IOException nos métodos.
            // DESSA FORMA FICA A CARGO DE QUEM CHAMOU O METODO DECIDIR COMO TRATAR

        }

    }
}

