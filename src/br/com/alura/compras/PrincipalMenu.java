package br.com.alura.compras;

import java.util.Collections;
import java.util.Scanner;

public class PrincipalMenu {
    public static void main(String[] args) {
        // vamos usar o Scanner para conseguir fazer utilização do terminal para digitação
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();

        // criando um cartão
        CartaodeCredito cartao = new CartaodeCredito(limite);

        // menu digite 0 para sair ou 1 para continuar
        int sair = 1;
        while(sair != 0) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            // realizando compra
            Compras compras = new Compras(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compras);

            if(compraRealizada) {
                System.out.println("Compra realizada");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }
        System.out.println("****************************");
        System.out.println("COMPRAS REALIZADAS: \n");
        // ordenando a compra pelo valor
        Collections.sort(cartao.getCompras());

        for (Compras c: cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n***********************");
        System.out.println("\n Saldo do cartão " + cartao.getSaldo() );
    }
}
