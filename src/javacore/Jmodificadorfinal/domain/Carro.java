package javacore.Jmodificadorfinal.domain;

// AO ADICIONAR O MODIFICADOR DE ACESSO "FINAL" A UMA CLASSE, ELA NUNCA PODERÁ SER HERDADA
// EX => PUBLIC FINAL CLASS CARRO {}
// O MESMO VALE PARA MÉTODOS, PORÉM NESSE CASO, O METODO COM "FINAL" NUNCA PODERA SER SOBRESCRITO"

public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();
    public static final double VELOCIDADE_LIMITE = 250;

//    {
//        VELOCIDADE_LIMITE = 250;
//    }

    public final void imprime() {
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
