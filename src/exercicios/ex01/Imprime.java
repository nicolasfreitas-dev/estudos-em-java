package exercicios.ex01;

import java.util.Scanner;

// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.

public class Imprime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int a = scan.nextInt();

        System.out.println("Digite o segundo número");
        int b = scan.nextInt();

        System.out.println("Digite o terceiro número");
        int c = scan.nextInt();

        int soma = a + b;

        System.out.println("A soma de A + B é: " + soma);

        if (soma < c) {
            System.out.println("A soma dos dois números é menor que o valor de C");
        } else {
            System.out.println("A soma dos dois números é maior que o valor de C");
        }

        scan.close();
    }
}
