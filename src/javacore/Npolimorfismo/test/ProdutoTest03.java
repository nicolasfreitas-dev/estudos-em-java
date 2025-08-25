package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.domain.Computador;
import javacore.Npolimorfismo.domain.Produto;
import javacore.Npolimorfismo.domain.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

// UM TIPO MAIS GENÊRICO "PRODUTO" FAZ REFERÊNCIA A UM TIPO MAIS ESPECIFICO "COMPUTADOR" E "TOMATE"
// TUDO QUE EU TENHO NO MAIS GENÊRICO, OU SEJA, NA SUPER CLASSE / PAI, EU VOU TER ACESSO NOS MAIS ESPECÍFICOS

// PORÉM UM METODO ESPECIFICO DO FILHO, EX: TOMATE (getValidade()), NÃO PODE SER VISTO OU CHAMADO PELA VARIÁVEL DE REFERÊNCIA "PRODUTO"

public class ProdutoTest03 {
    public static void main(String[] args) {
       Produto produto = new Computador("Ryzen 7", 5000);

       Tomate tomate = new Tomate("Tomate cereja", 10);
       tomate.setValidade("11/12/26");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
