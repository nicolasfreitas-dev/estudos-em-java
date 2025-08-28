package exercicios.ex07;

// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class Imprime {
    public static void main(String[] args) {
        boolean valor1 = true;
        boolean valor2 = true;

        if (valor1 && valor2) {
            System.out.println("Ambos são VERDADEIROS");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos são FALSOS");
        } else {
            System.out.println("Valores diferentes");
        }
    }
}
