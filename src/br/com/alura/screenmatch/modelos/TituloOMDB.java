package br.com.alura.screenmatch.modelos;

// Aqui so queremos fazer a traduçao de um campo para outro, ou seja a  a serealização: anotação do campo
// nao vamos querer ter na aplicaçao titulos OMDB e nem instanciar

public record TituloOMDB(String title, String year, String runtime) {
}
