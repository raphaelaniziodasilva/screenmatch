package br.com.alura.screenmatch.exception;

public class ErrorDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErrorDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    // vamos sobreescrever o metodo getMessage do java
    @Override
    public String getMessage() {
        // vamos devolver a nossa mensagem
        return this.mensagem;
    }
}
