package org.example;

public class StrategyPayPal implements StrategyPagamento{
    private String emailId;
    private String senha;

    public StrategyPayPal(String email, String senha){
        this.emailId = email;
        this.senha = senha;
    }
    @Override
    public void pagamento(int quantidade) {
        System.out.println(quantidade + " Pago com PayPal.");
    }
}
