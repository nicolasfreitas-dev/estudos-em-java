package javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {
    public void imprimeEstudante(Estudante estudante){
        System.out.println("---------------------------------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
