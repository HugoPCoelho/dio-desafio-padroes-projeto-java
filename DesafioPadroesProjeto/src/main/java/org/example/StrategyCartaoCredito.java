package org.example;

public class StrategyCartaoCredito implements StrategyPagamento{
    private String nome;
    private String numeroCartao;
    private String cvv;
    private String dataValidade;

    public StrategyCartaoCredito(String nome, String numCartao, String cvv, String validade){
        this.nome = nome;
        this.numeroCartao = numCartao;
        this.cvv = cvv;
        this.dataValidade = validade;
    }
    @Override
    public void pagamento(int quantidade) {
        System.out.println(quantidade + " Pago com Cartão de Crédito/Débito.");
    }
}
