package javacore.Oexception.exceptions.test;

import javacore.Oexception.exceptions.domain.Leitor1;
import javacore.Oexception.exceptions.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo1();
    }

    // AO UTILIZAR O TRY WITH RESOURCES PODEMOS OMITIR O CATCH MAS É NECESSÁRIO LANÇAR A EXCECAO NO METODO

    // SÓ É POSSIVEL COLOCAR OBJETOS OU VARIÁVEIS DE REFERENCIA, DENTRO DO TRY WITH RESOURCES,
    // QUE IMPLEMENTEM A INTERFACE CLOSEABLE OU AUTOCLOSEABLE

    // ESSE TRY WITH RESOURCES ESTÁ SE ENCARREGANDO DE FECHAR A CONEXÃO DA VARIÁVEL DE REFERENCIA

//    public static void lerArquivo() throws IOException {
//        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
//
//        }
//    }

    // OS RECURSOS SÃO FECHADOS NA ORDEM INVERSA QUE SÃO CHAMADOS NESSE CASO ABAIXO
    public static void lerArquivo1() {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
