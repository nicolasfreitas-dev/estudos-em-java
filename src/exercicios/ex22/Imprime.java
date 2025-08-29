package exercicios.ex22;

// 22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

public class Imprime {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 20;

        int resto = num1 % num2;
        int quociente = num1 / num2;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
