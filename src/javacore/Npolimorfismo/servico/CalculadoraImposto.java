package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.domain.Computador;
import javacore.Npolimorfismo.domain.Produto;
import javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatório de Imposto do Computador");
//        double imposto = computador.calcularImposto();
//
//        System.out.println("Computador: " + computador.getNome());
//        System.out.println("Valor: " + computador.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relatório de Imposto do Tomate");
//        double imposto = tomate.calcularImposto();
//
//        System.out.println("Tomate: " + tomate.getNome());
//        System.out.println("Valor: " + tomate.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//    }

    // DESACOMPLANDO O CALCULO DE IMPOSTO É POSSÍVEL REFATORAR TODO O CODIGO ACIMA
    // COM O POLIMORFISMO O MESMO METODO ESTA SENDO USADO PARA CALCULAR IMPOSTOS DIFERENTES COM O MESMO METODO

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto: " + imposto);

        // NARROWING CAST --> MAIS ESPECIFICO PRO MAIS GENERICO
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getValidade());

            // System.out.println(((Tomate) produto).getValidade());
        }
    }
}
