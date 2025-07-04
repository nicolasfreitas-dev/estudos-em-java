package javacore.AintroducaoClasses.exercicio.test;

import javacore.AintroducaoClasses.exercicio.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        System.out.println("Exercício de fixação de Classes");

        System.out.println("----------------------------------------");

        System.out.println("Carro 1:");

        carro.nome = "Fusca";
        carro.modelo = "bla bla bla";
        carro.ano = 1990;

        System.out.print("Nome: " + carro.nome + ", Modelo: " + carro.modelo + ", Ano: " + carro.ano + "\n");

        System.out.println("----------------------------------------");

        System.out.println("Carro 2:");

        carro2.nome = "Gol";
        carro2.modelo = "bla bla bla";
        carro2.ano = 2009;

        System.out.print("Nome: " + carro2.nome + ", Modelo: " + carro2.modelo + ", Ano: " + carro2.ano + "\n");

        System.out.println("----------------------------------------");

        // REFERÊNCIA DE OBJETOS => A referência anterior de "carro" é perdida em memória e não tem mais como voltar pra ele a não ser
        // que uma terceira variável ainda tem referência do valor de "carro".

        carro = carro2;

        System.out.println("Carro 1:");
        System.out.print("Nome: " + carro.nome + ", Modelo: " + carro.modelo + ", Ano: " + carro.ano + "\n");

    }
}
