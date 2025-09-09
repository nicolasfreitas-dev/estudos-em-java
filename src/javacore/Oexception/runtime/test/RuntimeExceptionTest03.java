package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    // O BLOCO FINALLY SEMPRE SERÁ EXECUTADO INDEPENDENTE DE HAVER EXCEÇÃO OU NÃO. É INTERESSANTE EM SITUAÇÕES ONDE VOCÊ
    // PRECISA LIDAR COM O RECURSO QUE VOCÊ ABRIU MESMO QUE HAJA UM PROBLEMA NO MEIO DO CAMINHO.

    // EX: EM UM CENÁRIO ONDE HOUVE UMA CONEXÃO COM O BANCO DE DADOS, PORÉM OCORREU UM ERRO,
    // MAS MESMO ASSIM VOCÊ QUER ENCERRAR A CONEXÃO COM O BANCO DE DADOS.

    private static void abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");

        }
    }
}
