package excecoes.personalizadas.Desafio02;

public class NomeInvalidoException extends Exception{
    // exceção para idade invalida
    public NomeInvalidoException(String nome) {
        super(nome); // construtor que recebe a mensagem do throw new e envia para a classe Exception armazenando
    }
}
