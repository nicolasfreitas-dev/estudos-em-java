package exercicios.ex17;

// 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
// Imprima na tela as duas temperaturas.

//Fórmula: C = (5 * ( F-32) / 9)

public class Imprime {
    public static void main(String[] args) {
        double temperaturaF =  70;
        double temperaturaC;

        temperaturaC = (5 * (temperaturaF - 32) / 9);

        System.out.printf("Temperatura: %.1fºC", temperaturaC);
    }
}
