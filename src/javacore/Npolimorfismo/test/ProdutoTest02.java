package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.domain.Computador;
import javacore.Npolimorfismo.domain.Produto;
import javacore.Npolimorfismo.domain.Tomate;

// UM TIPO MAIS GENÊRICO "PRODUTO" FAZ REFERÊNCIA A UM TIPO MAIS ESPECIFICO "COMPUTADOR" E "TOMATE"
// TUDO QUE EU TENHO NO MAIS GENÊRICO, OU SEJA, NA SUPER CLASSE / PAI, EU VOU TER ACESSO NOS MAIS ESPECÍFICOS

// PORÉM UM METODO ESPECIFICO DO FILHO, EX: TOMATE (getValidade()), NÃO PODE SER VISTO OU CHAMADO PELA VARIÁVEL DE REFERÊNCIA "PRODUTO"

public class ProdutoTest02 {
    public static void main(String[] args) {
       Produto produto = new Computador("Ryzen 7", 5000);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("----------------------------------------------------");

        Produto produto2 = new Tomate("Tomate cereja", 10);

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
