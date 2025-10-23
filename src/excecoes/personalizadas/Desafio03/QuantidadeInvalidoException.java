package Excecoes.Personalizadas.Desafio03;

// exceção para nome de quantidade invalida
public class QuantidadeInvalidoException extends RuntimeException {
    public QuantidadeInvalidoException(String quant) {
        super(quant);// construtor que recebe a mensagem do throw new e envia para a classe RuntimeException armazenando
    }
}
