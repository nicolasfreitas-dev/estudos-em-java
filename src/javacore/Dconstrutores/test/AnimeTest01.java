package javacore.Dconstrutores.test;

import javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "TV", 1500, "Aventura");
//        anime.setNome("Naruto");
//        anime.setTipo("Shounen");
//        anime.setEpisodios(500);

        anime.imprime();
    }
}
