package exercicios.ex18;

// 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
// Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.

public class Imprime {
    public static void main(String[] args) {
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        double crescimentoFrancisco = 0.02;
        double crescimentoSara = 0.03;
        int anos = 0;

        while (alturaSara <= alturaFrancisco) {
            alturaSara += crescimentoSara;
            alturaFrancisco += crescimentoFrancisco;
            anos++;
        }

        System.out.println("Serão necessários: " + anos + " anos");
        System.out.printf("Altura final de Francisco: %.2fm \n", alturaFrancisco);
        System.out.printf("Altura final de Sara: %.2fm", alturaSara);
    }
}
