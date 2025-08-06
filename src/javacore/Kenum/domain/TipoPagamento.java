package javacore.Kenum.domain;

// O METODO ABSTRATO É CRIADO APENAS PARA SER SOBRESCRITO. ELE NÃO PODE TER CORPO.
// NESSE CASO, SEU COMPORTAMENTO É DETERMINADO PELO VALOR INSERIDO PELO USUÁRIO E PELO METODO
// SOBRESCRITO "DEBITO" E "CREDITO"

public enum TipoPagamento {
     DEBITO {
         @Override
         public double calcularDesconto(double valor) {
             return valor * 0.1;
         }
     },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}

