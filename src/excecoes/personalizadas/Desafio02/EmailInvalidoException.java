package excecoes.personalizadas.Desafio02;

public class EmailInvalidoException extends Exception{
    // exceção para idade invalida
    public EmailInvalidoException(String email) {
        super(email); // construtor que recebe a mensagem do throw new e envia para a classe Exception armazenando
    }
}
