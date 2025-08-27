package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.repositorio.Repositorio;
import javacore.Npolimorfismo.servico.RepositorioArquivo;
import javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

// AO UTILIZAR OS CONCEITOS APRENDIDOS EM POLIMORFISMO PODEMOS UTILIZAR O TIPO MAIS GENERICO E PODEMOS UTILIZAR QUALQUER OBJETO
// QUE IMPLEMENTE O METODO QUE ESTAMOS PRECISANDO.

// EX + CONTEXTO: ESTAMOS SALVANDO UM ARQUIVO NO BANCO DE DADOS, PORÉM EM DETERMINADO MOMENTO
// DECIDIMOS MUDAR E SALVAR O ARQUIVO EM OUTRO LOCAL (LINHA 17).
// DESSA FORMA, AO USARMOS O TIPO MAIS GENERICO CONSEGUIMOS ULIZIAR OUTRO OBJETO QUE IMPLEMENTA O MESMO METODO
// USADO PARA SALVAR NO BANCO DE DADOS


public class RepositorioTest {
    public static void main(String[] args) {
        // RepositorioBancoDeDados repositorio = new RepositorioBancoDeDados();
        // RepositorioBancoDeDados repositorio = new RepositorioArquivo(); -->  vai dar ERRO
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}