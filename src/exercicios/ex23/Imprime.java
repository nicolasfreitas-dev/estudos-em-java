package exercicios.ex23;

// 23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.

// As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.

// Imprima na tela o salário líquido final.

public class Imprime {
    public static void main(String[] args) {
        double valorHoraAula = 50;
        int numeroDeAulas = 40;
        double percentualInss = 0.09;
        double salarioLiquido = 0;
        double salarioBruto = 0;

        salarioBruto = valorHoraAula * numeroDeAulas;
        salarioLiquido = salarioBruto - (salarioBruto * percentualInss);

        System.out.println("Salario Liquido: " + salarioLiquido);
    }
}
