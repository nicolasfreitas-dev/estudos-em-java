package exercicios.ex09;

// 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
// de acordo com a tabela abaixo:

// Fórmula do IMC = peso / (altura) ²
// Tabela Condições IMC

// Abaixo de 18,5 | Abaixo do peso
// Entre 18,6 e 24,9 | Peso ideal (parabéns)
// Entre 25,0 e 29,9 | Levemente acima do peso
// Entre 30,0 e 34,9 | Obesidade grau I
// Entre 35,0 e 39,9 | Obesidade grau II (severa)
// Maior ou igual a 40 | Obesidade grau III (mórbida)

public class Imprime {
    public static void main(String[] args) {
        double peso = 75.0;
        double altura = 1.69;

        double imc = peso / (altura * altura);

        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);

        if (imc < 18.5) {
            System.out.printf("Seu IMC é %.2f e você está abaixo do peso", imc);
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.printf("Seu IMC é %.2f e você está no peso ideal", imc);
        } else if (imc > 24.9  && imc < 29.9) {
            System.out.printf("Seu IMC é %.2f e você está levemente acima do peso", imc);
        } else if (imc > 29.9 && imc < 34.9) {
            System.out.printf("Seu IMC é %.2f e você está com obesidade grau I", imc);
        } else if (imc > 34.9 && imc < 39.9) {
            System.out.printf("Seu IMC é %.2f e você está com obesidade grau II", imc);
        } else if (imc >= 40 && imc <= 49.9) {
            System.out.printf("Seu IMC é %.2f e você está com obesidade grau III", imc);
        }
    }
}
