package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.exception.ErrorDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
// Vamos fazer o consumo de uma Api para buscar dados de filmes com java
// url do filme: https://www.omdbapi.com/?t=mummy&apikey=9dc6b2a1

    public static void main(String[] args) throws IOException, InterruptedException {
        // fazendo busca do filme pelo nome
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do filme ");
        var buscaFilme = leitura.nextLine();

        try {
            // urlEndereco vai receber a http + buscar filme: que vai ser digitado pelo terminal + API Key
            // vamos solucionar o erro da pesquisa que precisa ter espaço ex: top gun
            // buscaFilme.replace(" ", "+") vai substituir o espaço em branco pelo sinal de + para juntar: fazer concatenaçao
            String urlEndereco = "https://www.omdbapi.com/?t=" + buscaFilme.replace(" ", "+") +
                    "&apikey=9dc6b2a1";

            // fazendo requição e passando um endereço ("http://foo.com/")
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    // .uri(URI.create("https://www.omdbapi.com/?t=mummy&apikey=9dc6b2a1"))
                    .uri(URI.create(urlEndereco))
                    .build();
            // recebendo a resposta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // imprimindo a resposta ou seja o body do response em json
            String json = response.body();
            System.out.println(json);

            System.out.println("##########################################################");

//      vamos utilizar o pacote lib gson que baixamos e colocamos na pasta de dependencia
//      o Gson serve para Transfor um JSON em objeto
            // declarando: instanciando o Gson
            // Gson gson = new Gson();
//      vamos fazer a deserealização do titulo --> vamos pegar o json e transformar ele na classe titulo
            //  Titulo meuTitulo = gson.fromJson(json, Titulo.class);
//       imprimindo o nome, para isso precisamos buscar pelo nome que esta em josn: Title, Yar e etc...
//       vamos ter que fazer uma serealização: anotação no campos nome va para o arquivo titulo e faça essa serealização
            // System.out.println(meuTitulo );

            // vamos fazer de outra forma criando um arquivo separado chamado TituloOMDB para fazer a traduçao de um campo
            // ou seja a  a serealização: anotação do campo em vez de usar na nossa aplicaçao

            // vamos fazer um builden para dizer qual e o padrao de nomeclatura do json e assim vai conseguir traduzir todos os campos que foi solicitado
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            // usando o TituloOMDB temporario so para transferir dados json: resposta do body, TituloOMDB: a classe
            TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);
            System.out.println(meuTituloOMDB);

            // vamos usar o nosso Titulo que tem os metodos dentro dele
            Titulo meuTitulo = new Titulo(meuTituloOMDB);
            System.out.println("Titulo convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException error) {
            System.out.println("Aconteceu um erro ");
            System.out.println(error.getMessage());
        } catch (IllegalArgumentException error) {
            System.out.println("Erro na busca, verifique o endereço");
            System.out.println(error.getMessage());
        } catch (ErrorDeConversaoDeAnoException error) { // chamando a ErrorDeConversaoDeAnoException personalizada que criamos
            System.out.println(error.getMessage());
        }
        System.out.println("Programa finalizado");





    }
}
