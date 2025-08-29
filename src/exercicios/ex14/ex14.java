package exercicios.ex14;

// 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

public class ex14 {
    public static void main(String[] args) {
        int A = 15;
        int B = 20;
        int C;

        C = A;
        A = B;
        B = C;

        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
