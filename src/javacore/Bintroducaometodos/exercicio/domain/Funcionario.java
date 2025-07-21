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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
