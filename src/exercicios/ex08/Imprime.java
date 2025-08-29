package exercicios.ex08;

// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import java.util.Scanner;

public class Imprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = input.nextInt();

        System.out.println("Digite o terceiro número:");
        int n3 = input.nextInt();

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println(n1 + " " + n2 + " " + n3);
            } else {
                System.out.println(n1 + " " + n3 + " " + n2);
            }
        }

        if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println(n2 + " " + n1 + " " + n3);
            } else {
                System.out.println(n2 + " " + n3 + " " + n1);
            }
        }

        if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                System.out.println(n3 + " " + n1 + " " + n2);
            } else {
                System.out.println(n3 + " " + n2 + " " + n1);
            }
        }

        input.close();
    }
}
