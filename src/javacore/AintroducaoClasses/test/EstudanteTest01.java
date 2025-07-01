package javacore.AintroducaoClasses.test;

import javacore.AintroducaoClasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // Variável de referência = objeto do tipo Estudante
        Estudante estudante = new Estudante();

        estudante.nome = "Naruto";
        estudante.idade = 12;
        estudante.sexo = "M";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
