package br.com.alura.screenmatch.modelos;
public class Titulo {
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
}
