package exercicios.ex19;

// 19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Imprime {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada de " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
