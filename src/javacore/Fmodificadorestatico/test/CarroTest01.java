package javacore.Fmodificadorestatico.test;

import javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 =  new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 250);
        Carro c3 = new Carro("Audi", 300);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
