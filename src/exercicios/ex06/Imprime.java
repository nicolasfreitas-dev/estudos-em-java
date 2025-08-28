package exercicios.ex06;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

public class Imprime {
    public static void main(String[] args) {
        int valorQualquer = 50;

        double reajuste = valorQualquer * 0.05;

        double valorFinal = valorQualquer - reajuste;

        System.out.println("Reajuste: " + valorFinal);
    }
}
