package introducao;

public class Arrays {
    public static void main(String[] args) {
        // ARRAYS => REFERÊNCIA PARA UM ESPAÇO EM MEMÓRIA QUE PODE POSSUIR MAIS DE UM VALOR

        // variável de referência
        // int[] idades = null;

        // Em java é necessário dizer o tamanho do array

        int[] idades = new int[3];

        /*

            PADRÕES PARA REFERENCIA VAZIA

            byte, short, long, int, double, float => 0
            char '\u0000' => '  '
            boolean => false
            String => null

         */

        String[] nomes = new String[3];

        nomes[0] = "Naruto";
        nomes[1] = "Luffy";
        nomes[2] = "Goku";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // declarar e inicializar
        int[] numeros = { 1,2,3,4,5 };
        int[] numeros2 = { 5,4,3,2,1 };

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // ForEach => Ele não da o índice, se precisar de um índice específico melhor usar o outro For
        for (int num : numeros2) {
            System.out.println(num);
        }

    }
}
