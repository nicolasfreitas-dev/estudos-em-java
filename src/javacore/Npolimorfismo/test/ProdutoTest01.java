package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.domain.Computador;
import javacore.Npolimorfismo.domain.Televisao;
import javacore.Npolimorfismo.domain.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;



public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Acer Nitro", 6000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        Televisao tv = new Televisao("Samsung 19\"", 4000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------------------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------------------------------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
