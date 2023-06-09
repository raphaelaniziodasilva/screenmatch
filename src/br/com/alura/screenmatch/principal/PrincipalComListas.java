package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        // instanciando: criando um filme tipando com Filme
        Filme troia = new Filme("Trioa", 2008, true, 235, "MKV");
        troia.avalia(10);
        Filme TopGunMaverick = new Filme("TopGunMaverick", 2022, true, 215, "MKV");
        TopGunMaverick.avalia(8);
        var MegaShark = new Filme("MegaShark", 2017, false, 148, "MKV");
       MegaShark.avalia(7);
        Serie lost = new Serie("Lost", 2003, true, 235, 3,
                true, 8, 44);
        lost.avalia(4);

        // agora vamos criar uma lista de filmes
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(TopGunMaverick);
        listaDeFilmes.add(troia);
        listaDeFilmes.add(MegaShark);

        // agora vamos criar uma lista que aceite filmes e series
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(TopGunMaverick);
        lista.add(troia);
        lista.add(MegaShark);
        lista.add(lost);
        // percorrendo por cada item da lista
        for (Titulo item: lista) {
           System.out.println(item.getNome());
//            // vamos ver a classificação do filme
//            // tratando o item como filme
//            Filme filme = (Filme) item;
//            System.out.println("Classificação " + filme.getClassificacao());

            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        // ordenando a lista em ordem alfabetica mais antes precisamos fazer a comparação do nome do nome do filme com a serie
        // va no arquivo de titulo e implemente o Comparable<Titulo>
        System.out.println("Lista ordenada em ordem alfabetica");
        Collections.sort(lista);
        System.out.println(lista);

        // agora vamos lista em orde de lançamento ou seja por ano
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano");
        System.out.println(lista);

        System.out.println("#########################################################");

        // vamos usar outro metodo de lista emn vez de ArrayList usaremos o List
        // vamos criar uma lista e buscar pelo nome do artista
        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Tom Cruise");
        buscaPorArtista.add("Jason Stadeham");
        buscaPorArtista.add("Adam Sandler");
        System.out.println(buscaPorArtista);

        // ordenando a lista buscaPorArtista em ordem alfabetica
        Collections.sort(buscaPorArtista);
        System.out.println("Lista ordenada em ordem alfabetica");
        System.out.println(buscaPorArtista);














    }
}
