package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        // COM VAR ARGS VOCÊ PODE PASSAR O ARRAY DIRETAMENTO COMO SE FOSSEM VARIOS ARGUMENTOS DO METODO, POR DEBAIXO DOS PANOS
        // O JAVA TRANSFORMAR O VAR ARGS EM ARRAY "NORMAL". OQUE MUDA É APENAS A SINTAXE.

        // SINTAXE => TIPO... NOME_VARIÁVEI

        // SE HOUVER VAR ARGS NO METODO, O VAR ARGS DEVE SER OBRIGATORIAMENTE O ULTIMO PARÂMETRO OU DEVE SER O ÚNICO DESSE METODO.
        // ISSO OCORRE PORQUE SE O VAR ARGS FOR O PRIMEIRO (E HOUVER UM SEGUNDO APÓS ELE) O JAVA NÃO ENTENDE QUANDO O VAR ARGS DEVE ACABAR.

        Calculadora calculadora = new Calculadora();

        int[] numeros = { 1,2,3,4,5 };

        calculadora.somaArrays(numeros);

        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9,10);
    }
}
