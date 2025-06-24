package introducao;

public class Condicionais {
    public static void main(String[] args) {
        // IF IF-ELSE TERNÁRIO SWITCH CASE

        int idade = 18;

        boolean isAuthorized = idade >= 18;

        if (isAuthorized) {
            System.out.println("Autorizado a comprar bebida alcólica.");
        } else if (!isAuthorized) {
            System.out.println("Não autorizado a comprar bebida.");
        }

        System.out.println("---------------------------------------------------------------");

        // TERNÁRIO
        double salario = 6000;
        String msgDoar = "Doar X valores";
        String naoDoar = "Não posso doar";
        String resultado = salario > 5000 ? msgDoar : naoDoar;

        System.out.println(resultado);

        System.out.println("---------------------------------------------------------------");

        // SWITCH CASE

        int dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
    }
}
