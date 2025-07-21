package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setNome("Naruto");
//        anime.setTipo("Shounen");
//        anime.setEpisodios(500);
        anime.init("Naruto", "Shounen", 500, "Ação");

        anime.imprime();
    }
}
