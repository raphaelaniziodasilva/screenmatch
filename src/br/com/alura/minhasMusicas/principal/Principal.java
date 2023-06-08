package br.com.alura.minhasMusicas.principal;

import br.com.alura.minhasMusicas.modelo.MinhasPreferidas;
import br.com.alura.minhasMusicas.modelo.Musica;
import br.com.alura.minhasMusicas.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica cavaloDeTroia = new Musica();
        cavaloDeTroia.setTitulo("cavaloDeTroia");
        cavaloDeTroia.setCantor("Mc Kevin");

        // simulando reproduçoes
        for (int i = 0; i < 30045; i++) {
            cavaloDeTroia.reproduzir();
        }

        // simulando curtidas
        for (int i = 0; i < 14445; i++) {
            cavaloDeTroia.curtir();
        }

        Podcast podePa = new Podcast();
        podePa.setTitulo("Futebol");
        podePa.setApresentador("Os mlks");

        // simulando reproduçoes
        for (int i = 0; i < 122; i++) {
            podePa.reproduzir();
        }

        // simulando curtidas
        for (int i = 0; i < 68; i++) {
            podePa.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(cavaloDeTroia);
        preferidas.incluir(podePa);


    }
}
