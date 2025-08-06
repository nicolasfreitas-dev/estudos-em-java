package javacore.Kenum.test;

import javacore.Kenum.domain.Cliente;
import javacore.Kenum.domain.TipoPagamento;
import javacore.Kenum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        // ISSO GERA INCONSISTÊNCIA DE DADOS, POIS CADA PESSOA PODERIA ENTRAR O "TIPO" DE UM JEITO
        // DIFERENTE OCASIONANDO PROBLEMAS FUTUROS

        Cliente cliente1 = new Cliente("Naruto", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Naruto", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        // RETORNAR UM VALOR QUE DIZ SOBRE OQUE AQUELE ENUM SE TRATA BASEADO NO ATRIBUTO QUE VOCÊ DESEJA
        // O METODO VALUEOF() RETORNA BASEADO NO NOME QUE FOI PASSADO

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorTipoRelatorio("Pessoa física");
        TipoCliente tipoCliente3 = TipoCliente.tipoClientePorTipoRelatorio("Pessoa física12345");

        System.out.println(tipoCliente2);
        System.out.println(tipoCliente3);
    }
}
