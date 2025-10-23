package Excecoes.Personalizadas.Desafio02;

public class IdadeInvalidaExecption extends Exception {
    // exceção para idade invalida
    public IdadeInvalidaExecption (String idade) {
        super(idade); // construtor que recebe a mensagem do throw new e envia para a classe Exception armazenando
    }
}
