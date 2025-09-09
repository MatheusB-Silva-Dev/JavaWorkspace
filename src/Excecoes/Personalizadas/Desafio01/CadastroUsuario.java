package Excecoes.Personalizadas.Desafio01;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //onde pode acontecer a execeção, se a idade for menor que 18
        try{
            System.out.println("Digita a idade: ");
            int idade = teclado.nextInt();
            new CadastroUsuario().idade(idade); //chamando o metodo idade que valida se a idade e < ou > que 18
        } catch (IdadeInvalidaException e) { //captura a execção se idade for < 18

            System.out.println("Erro: " + e.getMessage()); // imprimi a mensagem que definimos na exceção personalizada que foi definida dentro do metodo idade
        }                                                  // e transportado atraves do super para a classe pai exception o e.getMessage captura a mensagem personalizada
    }                                                      // que definimos no throw new e que foi mandada atraves do super


    public void idade(int idade) throws IdadeInvalidaException { // throws indica que esse metodo pode lançar uma exceção
        if(idade < 18) {
            throw new IdadeInvalidaException("Idade menor que 18 não permitida!");// cria o obejto da exceção com a mensagem personalizada e e aqui que o super e acionado e a mensagem
                                                                                  // e enviada para a classe pai atraves do super
        }
    }

}
