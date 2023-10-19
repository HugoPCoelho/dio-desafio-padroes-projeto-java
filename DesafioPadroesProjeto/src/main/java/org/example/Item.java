package org.example;

public class Item {
    private String codigoProduto;
    private int preco;

    public Item(String codigo, int preco){
        this.codigoProduto = codigo;
        this.preco = preco;
    }

    public String getCodigoProduto(){
        return codigoProduto;
    }

    public int getPreco(){
        return preco;
    }
}
