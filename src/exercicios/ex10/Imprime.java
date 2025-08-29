package exercicios.ex10;

//  10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

public class Imprime {
    public static void main(String[] args) {
        double n1 = 5.5;
        double n2 = 10;
        double n3 = 7.2;

        double soma = n1 + n2 + n3;

        double media = soma / 3;

        System.out.printf("Media das notas: %.1f", media);
    }
}
