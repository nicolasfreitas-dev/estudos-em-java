package exercicios.ex16;

// 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e
// verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.

public class Imprime {
    public static void main(String[] args) {
        int A = 5;
        int B = 5;
        int C = 0;

        if (A == 0 || B == 0 || C == 0) {
            System.out.println("Essa figura não forma um triângulo");
        } else if (A == B && B == C && C == A) {
            System.out.println("Triângulo Equilátero");
        } else if (A == B || C == B || A == C) {
            System.out.println("Triângulo Isóceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    }
}