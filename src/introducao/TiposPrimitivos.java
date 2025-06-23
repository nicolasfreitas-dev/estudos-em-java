package introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /*
            TIPOS PRIMITIVOS

          int
          float
          double
          boolean
          byte
          short
          long
          char

        */

        int idade = 25;
        float media = 55.5F;
        double pi = 3.14;
        boolean isValid = true;
        byte idadeByte = 10;
        short idadeShort = 10;
        long numeroGrande = 654321;
        char caractere = 'M';
        char caractere2 = 'F';

        /*
            CASTING - converter pra outro tipo primitivo
        */

        // double pra int
        int numeroGrandeAleatorio = (int) 255453.4;

        // double pra float
        float numeroNovo = (float) 2500.00;

         /*
            EXERCICIO
         */

        String nome = "Nicolas";
        String endereco = "Rua Ribeiro Junior 507";
        double salario = 2500.00;
        String data = "10/06/2025";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + "R$ " + salario + ", na data " + data + ".");

    }
}
