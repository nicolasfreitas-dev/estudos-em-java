package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Estudante;
import javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Ichigo";
        estudante01.idade = 19;
        estudante01.sexo = "M";

        estudante02.nome = "Luffy";
        estudante02.idade = 19;
        estudante02.sexo = "M";

        impressora.imprimeEstudante(estudante01);
        impressora.imprimeEstudante(estudante02);
    }
}
