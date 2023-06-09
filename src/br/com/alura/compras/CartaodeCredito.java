package br.com.alura.compras;
import java.util.ArrayList;
import java.util.List;

public class CartaodeCredito {
    private double limite;
    private double saldo;
    // vamos precisar da lista de compras para ser associada ao cartão de credito para ter o controloe do limite
    private List<Compras> compras;

    public CartaodeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compra) {
        // verificando se tem limite o suficiente para realizar a compra
        if (this.saldo > compra.getValor()) {
            // fazendo a compra
            this.saldo -= compra.getValor();
            // adicionando a compra na lista de compras
            this.compras.add(compra);
            return true;
        } else {
            // se não tiver limite não consegue realizar a compra
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }

}
