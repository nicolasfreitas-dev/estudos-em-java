package javacore.Oexception.runtime.test;

// EM CASO DE MULTIPLAS EXCECOES QUANDO O THROW LANÇA A EXECPTION ELA VAI VERIFICAR QUAL CATCH ELA SE ADEQUA MELHOR E AO
// EXECUTAR O CATCH FINALIZA O BLOCO.

// QUANDO NÃO TEMOS UMA EXCEPTION QUE SE ENCAIXA NOS CATCHS QUE TEMOS, PODEMOS USAR UM FALLBACK PARA UM EXCEPTION MAIS GENÊRICA
// PORÉM, TEMOS UMA REGRA:

// 1. NÃO PODEMOS COLOCAR UM TIPO MAIS GENÊRICO NA FRENTE DE UM MAIS ESPECIFICO. AS MAIS GENÊRICAS SEMPRE SÃO NO FINAL, CASO CONTRARIO
// OS CATCHS MAIS ESPECIFICOS NEM CHEGAM A SER EXECUTADOS.

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        }
        catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }
        catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        // PARA UTILIZAR ESSA ESTRUTURA MAIS LEGÍVEL AS EXCEPTIONS NÃO PODEM ESTAR NA MESMA LINHA DE HERANÇA

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
