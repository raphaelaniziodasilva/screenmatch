package br.com.alura.compras;

public class Compras implements Comparable<Compras> {
    private String descricao;
    private double valor;

    public Compras(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    // gerando valor

    @Override
    public String toString() {
        return "Compras: descrição = " + descricao + ", valor=" + valor;
    }

    // ordenando a compra pelo valor
    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
