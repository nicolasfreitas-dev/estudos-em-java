package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.domain.Desenvolvedor;
import javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria", 10000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
