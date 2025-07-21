package javacore.Bintroducaometodos.exercicio.test;

import javacore.Bintroducaometodos.exercicio.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        // EXERCÍCIO DE FIXAÇÃO DE MÉTODOS

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João");
        funcionario.setIdade(26);
        funcionario.setSalarios(new double[]{5000, 3500, 2000});

        funcionario.imprime();
    }
}
