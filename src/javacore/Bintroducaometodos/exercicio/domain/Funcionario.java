package javacore.Bintroducaometodos.exercicio.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("Idade do funcionario: " + this.idade);

        for (double salario : this.salarios) {
            System.out.print(salario + " ");
        }

        imprimeMediaSalarios();
    }

    public void imprimeMediaSalarios() {
        double media = 0;

        for (double salario : this.salarios) {
            media += salario;
        }

        media /= this.salarios.length;

        System.out.println("\nA média dos salários é: " + media);
    }
}
