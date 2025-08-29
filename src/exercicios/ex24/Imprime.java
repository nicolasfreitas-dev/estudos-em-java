package exercicios.ex24;

// 24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.

// Deve-se fornecer ao usuário o tempo que será gasto na viagem, a sua velocidade média,
// distância percorrida e a quantidade de litros utilizados para fazer a viagem.

// Fórmula: distância = tempo x velocidade.
// litros usados = distância / 12.

public class Imprime {
    public static void main(String[] args) {
        double tempo = 12;
        double velocidadeMedia = 90;
        double distancia, litros;

        distancia = tempo * velocidadeMedia;
        litros = distancia / 12;

        System.out.println("Tempo: " + tempo + " horas");
        System.out.println("Velocidade: " + velocidadeMedia + " km/h");
        System.out.println("Distancia: " + distancia + " km");
        System.out.println("Litros: " + litros + " L");
    }
}
