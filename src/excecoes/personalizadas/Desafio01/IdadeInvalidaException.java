package Excecoes.Personalizadas.Desafio01;

public class IdadeInvalidaException extends Exception {
    //construtor que recebe a mensagem personalizada
    //envia para a classe pai Exception atraves do super
    public IdadeInvalidaException(String msg) {
        super(msg);
    }

}
