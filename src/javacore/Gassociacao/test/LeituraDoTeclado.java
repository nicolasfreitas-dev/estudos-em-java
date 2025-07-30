package javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número");
        int numero1 = scan.nextInt();

        System.out.println("Insira um número");
        int numero2 = scan.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos dois números é: " + soma);

        scan.close();
    }
}
