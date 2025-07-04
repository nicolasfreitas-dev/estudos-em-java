package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculadora;

/*
* Ao passar valores do tipo primitivo para um metodo, não estamos passando a referência daquele objeto em memória,
* mas sim fazendo uma cópia daquele objeto.
*
* */

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a, b);

        System.out.println("Dentro do calculadoraTest04");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
