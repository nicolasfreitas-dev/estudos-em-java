package exercicios.ex15;

// 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//consideração o ano com 365 dias e o mês com 30 dias.

//(Ex: 5 anos, 2 meses e 15 dias de vida)

public class Imprime {
    public static void main(String[] args) {
        int anoDeNascimento = 1999;
        int anoAtual = 2025;
        int dias, meses, anos;

        anos = anoAtual - anoDeNascimento;
        meses = anos * 12;
        dias = meses * 30;

        System.out.println(anos + " anos, " + meses + " meses" + " e " + dias + " dias");
    }
}
