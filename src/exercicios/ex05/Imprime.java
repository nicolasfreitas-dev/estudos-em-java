package exercicios.ex05;

// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
// usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Imprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioMinimo = 1518;

        System.out.println("Informe seu salário:");
        double salarioDoUsuario = input.nextDouble();

        double resultado = salarioDoUsuario / salarioMinimo;

        System.out.printf("O usuário recebe %.2f salário(s) mínimo(s).", resultado);

        input.close();
    }
}
