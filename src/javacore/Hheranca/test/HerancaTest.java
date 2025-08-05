package javacore.Hheranca.test;

import javacore.Hheranca.domain.Endereco;
import javacore.Hheranca.domain.Funcionario;
import javacore.Hheranca.domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Endereco endereco2 = new Endereco();
        Pessoa pessoa = new Pessoa("João da Silva");

        endereco.setRua("Rua das Laranjeiras");
        endereco.setCep("65054-021");

        pessoa.setCpf("1567894230");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Naruto");

        endereco2.setRua("Konohagakure");
        endereco2.setCep("564564-012");

        funcionario.setCpf("5789751132");
        funcionario.setEndereco(endereco2);
        funcionario.setSalario(5000);
        funcionario.imprime();
    }
}
