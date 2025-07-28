package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Escola;
import javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor[] professores = {professor};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
