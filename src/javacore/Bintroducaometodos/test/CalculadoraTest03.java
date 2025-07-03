package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(65, 5);

        System.out.println(resultado);
    }
}
