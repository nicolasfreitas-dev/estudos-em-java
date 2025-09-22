package javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Nicolas"; // String constant pool
        String nome2 = "Nicolas";


        // O ESPERADO SERIA A STRING "NICOLAS" CONCATENAR COM "FREITAS" E FICAR "NICOLAS FREITAS"
        // PORÉM DEVIDO A IMUTABILIDADE DA CLASSE STRING ISSO NÃO OCORRE
        // ALÉM DISSO NÃO HÁ UMA VARIÁVEL DE REFERÊNCIA PARA O NOVO VALOR CONCATENADO
        // nome.concat(" Freitas");

        nome = nome.concat(" Freitas");
        System.out.println(nome);

        // PARA COMPARAR SE A REFERÊNCIA É IGUAL, SE FOSSE UMA COMPARAÇÃO DAS STRINGS O CERTO SERIA USAR EQUALS
        System.out.println(nome == nome2);

        // AO FAZER O EXEMPLO ABAIXO 3 COISAS ESTÃO OCORRENDO:
        // 1 - CRIAÇÃO DE UMA NOVA VARIÁVEL DE REFERÊNCIA
        // 2 - CRIAÇÃO DE UM NOVO OBJETO DO TIPO STRING
        // 3 - UMA STRING NO POOL DE STRINGS
        String nome3 = new String("Nicolas");

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
