package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Character;

/***
 * TIPOS DE ASSOCIAÇÃO
 *
 * 1 -> 1
 * 1 -> MUITOS
 * MUITOS -> 1
 * MUITOS -> MUITOS
 *
 * EXEMPLOS:
 *
 * 1 CHAR -> 1 JOGADOR (ESSE CHAR PERTENCE APENAS A ESSE JOGADOR, MAS UM JOGADOR PODE TER VÁRIOS CHARS)
 * 1 TIME E-SPORTS -> VÁRIOS JOGADORES (UM TIME PODE TER DIVERSOS JOGADORES A SUA DISPOSIÇÃO)
 * N JOGADORES -> 1 TIME (VÁRIOS JOGADORES PODEM JOGAR PARA UM TIME)
 * N ESTUDANTES -> 1 CURSO (VÁRIOS ESTUDANTES PODEM SER ALUNOS DE UMA FACULDADE FEDERAL, MAS UM ALUNO SÓ PODE FAZER UM CURSO PÚBLICO)
 *
 */

public class CharacterTest01 {
    public static void main(String[] args) {
        Character character01 = new Character("Kayden");
        Character character02 = new Character("Yuki");
        Character character03 = new Character("Zang");

        Character[] characteres = new Character[]{character01, character02, character03};

        for (Character character : characteres) {
            character.imprime();
        }
    }
}
