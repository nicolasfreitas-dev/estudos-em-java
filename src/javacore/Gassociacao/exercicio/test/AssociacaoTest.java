package javacore.Gassociacao.exercicio.test;

import javacore.Gassociacao.exercicio.domain.Aluno;
import javacore.Gassociacao.exercicio.domain.Local;
import javacore.Gassociacao.exercicio.domain.Professor;
import javacore.Gassociacao.exercicio.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua fulano de tal");
        Aluno aluno = new Aluno("Paulo", 18);
        Professor professor = new Professor("João", "História");

        Aluno[] alunosDoSeminario = {aluno};

        Seminario seminario = new Seminario("Primeira Guerra", alunosDoSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
