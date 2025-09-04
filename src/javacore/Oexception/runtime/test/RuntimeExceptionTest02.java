package javacore.Oexception.runtime.test;

// LANÇANDO EXCEÇÕES DO TIPO UNCHECKED

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código finalizado!");
    }

    private static int divisao(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, o valor não pode ser 0.");
        }

        return a / b;
    }
}
