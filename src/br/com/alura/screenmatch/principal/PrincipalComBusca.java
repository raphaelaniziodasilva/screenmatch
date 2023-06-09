package br.com.alura.screenmatch.principal;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalComBusca {
// Vamos fazer o consumo de uma Api para buscar dados de filmes com java
// url do filme: https://www.omdbapi.com/?t=mummy&apikey=9dc6b2a1

    public static void main(String[] args) throws IOException, InterruptedException {
        // fazendo requição e passando um endereço ("http://foo.com/")
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=mummy&apikey=9dc6b2a1"))
                .build();
        // recebendo a resposta
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        // imprimindo a resposta ou seja o body do response em json
        System.out.println(response.body());
    }
}
