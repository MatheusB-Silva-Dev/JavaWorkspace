package excecoes.personalizadas.Desafio04;
// Exceção personalizada para nome inválido, estende RuntimeException
public class NomeProdutoInvalidoException extends RuntimeException {
    public NomeProdutoInvalidoException(String nomeMsg) {
        super(nomeMsg); // Mensagem passada para a superclasse RuntimeException atraves do throw new
    }
}
