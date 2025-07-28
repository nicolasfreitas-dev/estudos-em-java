package javacore.Gassociacao.domain;

public class Character {
    private String nome;
    private ClasseRpg classe;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        if (this.classe != null) {
            System.out.println("Classe: " + this.classe.getClasse());
        }
    }

    public Character(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClasseRpg getClasse() {
        return classe;
    }

    public void setClasse(ClasseRpg classe) {
        this.classe = classe;
    }
}
