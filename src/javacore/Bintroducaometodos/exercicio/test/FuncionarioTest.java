package javacore.Bintroducaometodos.exercicio.test;

import javacore.Bintroducaometodos.exercicio.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        // EXERCÍCIO DE FIXAÇÃO DE MÉTODOS

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Joao";
        funcionario.idade = 26;
        funcionario.salarios = new double[]{5000, 3500, 2000};

        funcionario.imprime();
    }
}
