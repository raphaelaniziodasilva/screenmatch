package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutisPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutisPorEpisodio() {
        return minutisPorEpisodio;
    }

    public void setMinutisPorEpisodio(int minutisPorEpisodio) {
        this.minutisPorEpisodio = minutisPorEpisodio;
    }
    // Sobrescrita de métodos
    // vamos sobreescrever o metodo herdado do titulo para a serie
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodioPorTemporada * minutisPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
