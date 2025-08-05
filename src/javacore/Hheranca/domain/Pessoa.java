package javacore.Hheranca.domain;

// MODIFICADOR DE ACESSO "PROTECTED" DA ACESSO A TODAS AS CLASSES DO MESMO PACOTE.
// AS SUBCLASSES QUE HERDAM DA CLASSE "PAI" POSSUEM ACESSO EM QUALQUER LUGAR, INDEPENDENTE DO PACOTE
// EX: CONFERIR CLASSE FILHA "FuncionarioTest"

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco estático de Pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático de Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático de Pessoa 2");
    }

    // AO CRIAR UM CONSTRUTOR EM UMA CLASSE PAI, A CLASSE FILHA TAMBÉM SERÁ AFETADA EXIGINDO OS MESMOS
    // ARGUMENTOS PARA INICIALIZACAO.

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + ", " + "CEP: " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}