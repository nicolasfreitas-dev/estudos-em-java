package javacore.AintroducaoClasses.test;

import javacore.AintroducaoClasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Kakashi";
        professor.idade = 30;
        professor.sexo = "M";

        System.out.print("Nome: " + professor.nome + ", Idade: " + professor.idade + ", Sexo: " + professor.sexo);
    }
}
