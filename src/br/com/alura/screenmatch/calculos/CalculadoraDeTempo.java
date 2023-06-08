package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private double tempoTotal = 0;

    public double getTempoTotal() {
        return this.tempoTotal;
    }
//     calculando o tempo dos filmes
//    public void inclui(Filme filme) {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//     calculando o tempo das series
//    public void inclui(Serie serie) {
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    // calculando o tempo do filme e serie todos juntos para isso vamos usar a classe pai titulo
    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duraçao em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
