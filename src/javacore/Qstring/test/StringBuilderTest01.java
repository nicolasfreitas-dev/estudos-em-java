package javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Nicolas";
        nome.concat(" Freitas");

        nome.substring(0, 2);

        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Nicolas Freitas");
        sb.append(" Pinheiro");

        // TOMAR CUIDADO PARA VERIFICAR SE O RETORNO DO METODO É UMA STRING OU STRING BUILDER
        // POIS A STRING É IMÚTAVEL

        // sb.substring(0, 2);
        // sb.reverse();
        // sb.delete(0, 3); --> 0 a (3 - 1) (pega até o penúltimo)

        System.out.println(sb);
    }
}
