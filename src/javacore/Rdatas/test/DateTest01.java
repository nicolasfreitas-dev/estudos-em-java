package javacore.Rdatas.test;

import java.util.Date;

// A CLASSE DATE HOJE EM DIA NÃO É UTILIZADA, POIS FOI DEPRECIADA
// DATE CONTA O TEMPO EM MILISEGUNDOS
// ELE TEM REGISTRADO O TEMPO DESDE 1 DE JANEIRO DE 1970

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1000000000000L);

        System.out.println(date); // AO CHAMARMOS COM O toString ELE FAZ A CONVERSÃO PARA UMA DATA QUE PODEMOS ENTENDER
        // System.out.println(date.toString());
        System.out.println(date.getTime()); // PARA PEGAR OS MILISEGUNDOS DO DATA ATUAL
    }
}
