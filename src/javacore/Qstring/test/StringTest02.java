package javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "      Luffy          ";
        String numeros = "0123456789";

        System.out.println(nome.charAt(0));

        System.out.println(nome.length());

        System.out.println(nome.replace("f", "l"));

        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.length());

        // PASSA ONDE COMEÇA E ONDE TERMINA, PORÉM O QUE TERMINA É SEMPRE 1 A MENOS
        // OU SEJA, NO EXEMPLO ABAIXO ELE IRÁ COMEÇAR EM 0 E IRÁ ATÉ O ÍNDICE 1
        System.out.println(numeros.substring(0, 2));

        System.out.println(nome.trim());

    }
}
