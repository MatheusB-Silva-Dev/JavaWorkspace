package Excecoes.Personalizadas.Desafio04;
// Exceção personalizada para quantidade inválida, estende RuntimeException
public class QuantidadeInvalidoException extends RuntimeException {
    public QuantidadeInvalidoException(String quantidadeMsg) {
        super(quantidadeMsg); // Mensagem passada para a superclasse RuntimeException atraves do throw new
    }
}
