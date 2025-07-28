package javacore.Gassociacao.domain;

public class ClasseRpg {
    private String classe;
    private Character[] characters;

    public void imprime() {
        System.out.println("Nome: " + this.classe);

        if (this.characters != null) {
            for (Character character : this.characters) {
                System.out.println(character.getNome());
            }
        }
    }

    public ClasseRpg(String classe, Character[] characters) {
        this.classe = classe;
        this.characters = characters;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }
}
