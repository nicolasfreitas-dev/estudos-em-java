package introducao;

public class Repeticao {
    public static void main(String[] args) {
        // FOR WHILE DO-WHILE

        int limite = 10;
        int numero = 5;

        // FOR
        for (int i = 0; i < limite; i++) {
            System.out.println("Número sendo incrementado: " + ++numero);
        }

        System.out.println("---------------------------------------------------------------");

        // WHILE => FAZ VERIFICAÇÃO NO INÍCIO ANTES DE EXECUTAR O BLOCO DE CÓDIGO
        int contador = 0;

        while (contador < 20) {
            contador++;

            System.out.println("Contador: " + contador);
        }

        System.out.println("---------------------------------------------------------------");

        // DO WHILE => EXECUTA O BLOCO DE CÓDIGO AO MENOS UMA VEZ ANTES DE REALIZAR A VERIFICAÇÃO DA CONDIÇÃO
        int contador2 = 1;

        do {
            System.out.println("Contador2: " + contador2);
            contador2++;

        } while (contador2 <= 20);

    }
}
