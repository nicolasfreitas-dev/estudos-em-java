package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Character;
import javacore.Gassociacao.domain.ClasseRpg;

// // ASSOCIAÇÃO BIDIRECIONAL => UMA CLASSE PODE SER ESCOLHIDA POR VÁRIOS PERSONAGENS

public class CharacterTest03 {
    public static void main(String[] args) {
        Character character1 = new Character("Yuki");
        Character character2 = new Character("Kayden");
        Character character3 = new Character("Frost");

        Character[] characters = {character1, character2, character3};

        ClasseRpg classe = new ClasseRpg("Mago", characters);

        character1.setClasse(classe);
        character2.setClasse(classe);
        character3.setClasse(classe);

        classe.setCharacters(characters);

        System.out.println("----------------- Personagem -----------------");

        character1.imprime();

        System.out.println("----------------- Personagem -----------------");

        character2.imprime();

        System.out.println("----------------- Personagem -----------------");

        character3.imprime();
    }
}
