package exercicios.ex20;

// 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

public class Imprime {
    public static void main(String[] args) {
        int tabuada = 3;

        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + tabuada * i);
        }
    }
}
