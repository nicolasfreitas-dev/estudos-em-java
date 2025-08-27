package exercicios.ex03;

import java.util.Scanner;

// 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
// caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
// imprimir seu valor na tela.

public class Imprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = input.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = input.nextInt();

        int resultado;
        int imprimeValor;

        if (num1 == num2) {
            resultado = num1 + num2;
        } else {
            resultado = num1 * num2;
        }

        imprimeValor = resultado;

        System.out.println("O resultado final foi: " + imprimeValor);

        input.close();
    }
}
