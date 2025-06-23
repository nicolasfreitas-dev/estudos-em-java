package introducao;

public class Operadores {
    public static void main(String[] args) {
        // ARITMÉTICOS => + - = /
        // + pode ser utilizado para concatenar

        int numero1 = 10;
        int numero2 = 20;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int divisao = numero1 / numero2;
        int multiplicacao = numero1 * numero2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);

        // Resto da divisão => %
        int resto = numero1 % numero2;

        System.out.println(resto);

        // RELACIONAIS => > < <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;

        System.out.println("Resultado: " + isDezMaiorQueVinte);

        // LÓGICOS => AND ( && ) / OR ( || ) / NOT ( ! )

        int idade = 64;
        int idade2 = 16;
        int votoObrigatorio = 18;

        boolean isVotoOpcional = (idade >= 16 && idade < 18) || (idade > 64) ;

        System.out.println("Resultado: " + isVotoOpcional);

        // ATRIBUIÇÃO => == += -= *= /= %=
        int numero3 = 10;

        // Exemplos
        numero3 += 5;
        numero3 -= 5;
        numero3 *= 5;
        numero3 /= 5;
        numero3 %= 6;

        boolean verificar = numero3 == 5;

        System.out.println("Numero 3: " + verificar);

        // ++ --

        // ++ ou -- depois => primeiro executa a variável dps incrementa/decremente
        // ++ ou -- antes => primeiro incrementa/decrementa dps executa a variável

        numero3++;

        System.out.println("Pós incremento: " + numero3);

        numero3--;

        System.out.println("Pós decremento: " + numero3);

    }
}
