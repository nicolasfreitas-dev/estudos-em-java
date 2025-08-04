package javacore.Hheranca.domain;

// EM JAVA NAO E POSSIVEL EXTENDER MAIS DE UMA CLASSE

public class Funcionario extends Pessoa {
    private double salario;

    // UTILIZANDO A SUPER CLASSE PARA SOBRESCREVER O METODO PRESENTE NO PAI E ADICIONANDO A IMPRECAO DO SALARIO"

    public void imprime() {
        super.imprime();

        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
