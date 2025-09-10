package javacore.Oexception.exceptions.test;

import javacore.Oexception.exceptions.domain.Funcionario;
import javacore.Oexception.exceptions.domain.Pessoa;

public class SobrescritaComException01 {
    public static void main(String[] args) {
        Pessoa pessoa = new  Pessoa();
        Funcionario funcionario = new  Funcionario();

        funcionario.salvar();
    }
}
