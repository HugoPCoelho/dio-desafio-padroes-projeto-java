package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    List<Item> items;

    public CarrinhoCompras(){
        this.items = new ArrayList<Item>();
    }

    public void adicionaItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int precoTotal(){
        int soma = 0;
        for(Item item : items){
            soma += item.getPreco();
        }
        return soma;
    }

    public void pagar(StrategyPagamento metodoPagamento){
        int quantidade = precoTotal();
        metodoPagamento.pagamento(quantidade);
    }
}
