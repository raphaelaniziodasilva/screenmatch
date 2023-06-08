import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class PrincipalScreenmatch {
    public static void main(String[] args) {
        // instanciando: criando um filme chamado troia e tipando com Filme
        Filme troia = new Filme("Trioa", 2022, true, 235, "MKV");

        // atribuindo valores
//        troia.setNome("Troia");
//        troia.setAnoDeLancamento(2021);
//        troia.setIncluidoNoPlano(true);
//        troia.setDuracaoEmMinutos(185);
        System.out.println("Duraçao do filme " + troia.getDuracaoEmMinutos());

        // chamando o metodo para imprimir os dados do filme
        troia.exibiFichaTecnica();

        // dando avaliaçoes pro filme
        troia.avalia(8);
        troia.avalia(9);
        troia.avalia(8.5);

        System.out.println("Total de avaliaçao " + troia.getTotalDeAvaliacoes());

        // media das avaliaçoes
        System.out.println(troia.pegaMedia());

        System.out.println("#########################################################");

        // instanciando: criando uma serie chamado lost e tipando com Serie
        Serie lost = new Serie("Trioa", 2022, true, 235, 3,
                true, 8, 44);
        System.out.println("Duraçao para maratonar lost " + lost.getDuracaoEmMinutos());

        // instanciando: criando um filme e tipando com Filme
        Filme TopGunMaverick = new Filme("TopGunMaverick", 2022, true, 215, "MKV");

        // criando uma calculadora
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        // adicionando os filmes e series
        calculadora.inclui(troia);
        calculadora.inclui(TopGunMaverick);
        calculadora.inclui(lost);
        // fazendo a soma dos minutos dos filmes e series adicionado
        System.out.println(calculadora.getTempoTotal());

        // filtro de recomendaçoes
        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(troia);
        filtro.filtra(TopGunMaverick);
        filtro.filtra(lost);

        // instanciando: criando um episodio e tipando com Episodio
        Episodio episodio = new Episodio();
        episodio.setNome("The Island");
        episodio.setSerie(lost);
        episodio.setNumero(1);
        episodio.setTotalDeAvaliacoes(144);
        filtro.filtra(episodio);

        var MegaShark = new Filme("MegaShark", 2022, false, 148, "MKV");
        MegaShark.avalia(10);

        // agora vamos criar uma lista de filmes
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(TopGunMaverick);
        listaDeFilmes.add(troia);
        listaDeFilmes.add(MegaShark);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());

        // antes de imprimir a lista de filmes vamos para o arquivo de filmes e sobreescrever o metodo toString
        System.out.println(listaDeFilmes);







    }
}
