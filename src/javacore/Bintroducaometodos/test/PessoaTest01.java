package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();

        pessoa01.setNome("Naruto");
        pessoa01.setIdade(15);

        // pessoa01.imprime();

        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());
    }
}
