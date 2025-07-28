package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Character;
import javacore.Gassociacao.domain.ClasseRpg;

// ASSOCIAÇÃO UNIDIRECIONAL => UM PERSONAGEM TEM UMA CLASSE

public class CharacterTest02 {
    public static void main(String[] args) {
        Character character01 = new Character("Kayden");
        // ClasseRpg classeRpg01 = new ClasseRpg("Mage");

        // character01.setClasse(classeRpg01);

        character01.imprime();
    }
}
