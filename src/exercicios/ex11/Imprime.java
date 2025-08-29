package exercicios.ex11;

//  11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

public class Imprime {
    public static void main(String[] args) {
        double n1 = 5.5;
        double n2 = 10;
        double n3 = 7.2;
        double n4 = 7.2;

        String nomeAluno = "Fulano de tal";

        double soma = n1 + n2 + n3 + n4;

        double media = soma / 4;

        System.out.println("Aluno: " + nomeAluno);
        System.out.printf("Media: %.1f \n", media);

        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }

    }
}
