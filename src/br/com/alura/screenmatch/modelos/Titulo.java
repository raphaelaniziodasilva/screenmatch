package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exception.ErrorDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    // constructor
    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Titulo(TituloOMDB meuTituloOMDB) {
        this.nome = meuTituloOMDB.title();

        // solucuinando o erro do ano pois ele esta vindo com mais de 4 caracteres ex: "2018–"
        if(meuTituloOMDB.year().length() > 4) {
            // criando uma nova exception
            throw new ErrorDeConversaoDeAnoException("Nao conseguiu converter o ano porque tem mais de 4 caracteres");

        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOMDB.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDB.runtime().substring(0, 2));
    }

    // metodos: comportamento

    // quando queremos pegar alguma coisa usamos o getters para obter valor
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // quando queremos colocar: incluir algum valor usamos o setters para atribuir  valor
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // quando o metodo só vai fazer alguma coisa e ele nao tem o retorno declaramos como void
    public void exibiFichaTecnica() {
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de lançamento " + anoDeLancamento);
        System.out.println("Tempo de duraçao " + duracaoEmMinutos);
        System.out.println("Esta incluido no plano ? " + incluidoNoPlano);
        System.out.println("Avaliaçao final " + totalDeAvaliacoes);
    }
    // avaliaçao do filme
    public void avalia(double nota) {
        somaDasAvaliacao += nota; // somando todas as avaliaçoes
        // cada vez que for colocado uma avaliaçao ele vai incrementando uma por uma
        totalDeAvaliacoes++;
    }
    // media fazendo a media das avaliaçoes e retornando a media
    public double pegaMedia() {
        return somaDasAvaliacao / totalDeAvaliacoes;
    }

    // ordenando a lista em ordem alfabetica mais antes precisamos fazer a comparação dos nomes
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome: " + nome  + ", anoDeLancamento: " + anoDeLancamento + ", duraçao: " + duracaoEmMinutos + " minutos";
    }
}
