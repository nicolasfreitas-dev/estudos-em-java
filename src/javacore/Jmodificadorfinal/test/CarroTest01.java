package javacore.Jmodificadorfinal.test;

import javacore.Jmodificadorfinal.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Goku");
        System.out.println(carro.COMPRADOR);
    }
}
