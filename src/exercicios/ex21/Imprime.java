package exercicios.ex21;

// 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

public class Imprime {
    public static void main(String[] args) {
        int random = (int) Math.floor(Math.random() * 100);

        System.out.println("Número aleatorio: " + random);
    }
}
