package exercicios.ex02;

// 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Imprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num = input.nextDouble();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é Par!");
        } else {
            System.out.println("O número " + num + " é Ímpar!");
        }

        if (num < 0) {
            System.out.println("O número " + num + " é Negativo!");
        } else {
            System.out.println("O número " + num + " é Positivo!");
        }

        input.close();
    }
}
