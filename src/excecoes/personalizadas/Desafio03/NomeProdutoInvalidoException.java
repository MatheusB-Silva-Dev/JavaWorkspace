package Excecoes.Personalizadas.Desafio03;

public class NomeProdutoInvalidoException extends RuntimeException {
    // exceção para nome de produto invalido
    public NomeProdutoInvalidoException(String nome) {
        super(nome); // construtor que recebe a mensagem do throw new e envia para a classe RuntimeException armazenando
    }
}
