package org.example;

public class Teste {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        Item item1 = new Item("1234", 40);
        Item item2 = new Item("5678", 10);

        carrinho.adicionaItem(item1);
        carrinho.adicionaItem(item2);

        //Pagamento por PayPal
        carrinho.pagar(new StrategyPayPal("meuemail@exemplo.com", "minhasenha"));

        carrinho.removeItem(item1);

        //Pagamento por Cartão de Crédito
        carrinho.pagar(new StrategyCartaoCredito("Meu Nome", "12345678", "909", "10/25"));
    }
}