package exercicios.ex04;

import java.util.Scanner;

// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class Imprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = input.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("Antecessor do número " + num + " é: " + antecessor);
        System.out.println("Sucessor do número " + num + " é: " + sucessor);

        input.close();
    }
}
