package br.com.alura.minhasMusicas.modelo;

public class MinhasPreferidas {
    public void incluir(Audio audio) {
        if(audio.getClassificacao() >= 7) {
            System.out.println(audio.getTitulo() + " Sucesso absoluto ouvidas em todos os lugares");
        } else {
            System.out.println(audio.getTitulo() + " Náo é tao ouvida");
        }
    }
}
