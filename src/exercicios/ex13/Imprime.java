package exercicios.ex13;

//  13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

public class Imprime {
    public static void main(String[] args) {
       String nome = "João da Silva";
       int idade = 25;

       if (idade >= 18) {
           System.out.println(nome + " é maior de idade");
       } else {
           System.out.println(nome + " é menor de idade");
       }
    }
}
