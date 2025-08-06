package javacore.Kenum.domain;

// DEIXAR O TIPO COMO STRING DEIXA O SISTEMA SUJEITO A ERROS, POIS CADA USUARIO PODE DIGITAR DE UMA FORMA.
// SEM ENUM SERIA NECESSARIO CRIAR ATRIBUTOS CONSTANTES E FAZER UMA VALIDAÇÃO DENTRO DO CONSTRUTOR PARA
// CONFERIR O TIPO DURANTE A INICIALIZAÇÃO DO OBJETO (EXEMPLOS COMENTADOS ABAIXO).

//    private String tipo;

//    public static final String PESSOA_FISICA = "PESSOA_FISICA";
//    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

//    public Cliente(String nome, String tipo) {
//        if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)) {
//           return;
//       }
//
//        this.nome = nome;
//        this.tipo = tipo;
//    }

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
