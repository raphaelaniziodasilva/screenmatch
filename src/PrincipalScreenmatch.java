import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class PrincipalScreenmatch {
    public static void main(String[] args) {
        // instanciando: criando um filme chamado meuFilme e tipando com Filme
        Filme meuFilme = new Filme();
        // atribuindo valores
        meuFilme.setNome("Mafia");
        meuFilme.setAnoDeLancamento(2021);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(185);
        System.out.println("Duraçao do filme " + meuFilme.getDuracaoEmMinutos());

        // chamando o metodo para imprimir os dados do filme
        meuFilme.exibiFichaTecnica();

        // dando avaliaçoes pro filme
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(8.5);

        System.out.println("Total de avaliaçao " + meuFilme.getTotalDeAvaliacoes());

        // media das avaliaçoes
        System.out.println(meuFilme.pegaMedia());

        System.out.println("#########################################################");

        // instanciando: criando uma serie chamado lost e tipando com Serie
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2007);
        lost.exibiFichaTecnica();
        lost.setTemporadas(3);
        lost.setEpisodioPorTemporada(8);
        lost.setMinutisPorEpisodio(22);
        System.out.println("Duraçao para maratonar lost " + lost.getDuracaoEmMinutos());

        // instanciando: criando um filme e tipando com Filme
        Filme TopGunMaverick = new Filme();
        // atribuindo valores
        TopGunMaverick.setNome("Top Gun Maverick");
        TopGunMaverick.setAnoDeLancamento(2022);
        TopGunMaverick.setIncluidoNoPlano(true);
        TopGunMaverick.setDuracaoEmMinutos(200);

        // criando uma calculadora
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        // adicionando os filmes e series
        calculadora.inclui(meuFilme);
        calculadora.inclui(TopGunMaverick);
        calculadora.inclui(lost);
        // fazendo a soma dos minutos dos filmes e series adicionado
        System.out.println(calculadora.getTempoTotal());

        // filtro de recomendaçoes
        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(TopGunMaverick);
        filtro.filtra(lost);

        // instanciando: criando um episodio e tipando com Episodio
        Episodio episodio = new Episodio();
        episodio.setNome("The Island");
        episodio.setSerie(lost);
        episodio.setNumero(1);
        episodio.setTotalDeAvaliacoes(144);
        filtro.filtra(episodio);





    }
}
