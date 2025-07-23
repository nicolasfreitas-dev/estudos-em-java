package javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 1; i < episodios.length; i++) {
            episodios[i] = i + 1;

            System.out.println(i + ": " + episodios[i]);
        }
    }

    public Anime() {
        System.out.println("Direto do construtor");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
