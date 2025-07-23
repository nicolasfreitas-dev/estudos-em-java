package javacore.Fmodificadorestatico.domain;

// BLOCO DE INICIALIZAÇÃO ESTÁTICO SÓ É INICIALIZADO UMA VEZ QUANDO A JVM CARREGAR A CLASSE
// NÃO É POSSÍVEL ACESSAR OBJETOS DE INTÂNCIAS A PARTIR DE MÉTODOS ESTÁTICOS
// É POSSÍVEL TER BLOCOS ESTÁTICOS E NÃO ESTÁTICOS JUNTOS

public class Anime {
    private String nome;
    private static int[] episodios;
    static {
        System.out.println("Dentro do bloco de inicializacao estático 1");

        episodios = new int[100];
        for (int i = 1; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicializacao não estático");
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
