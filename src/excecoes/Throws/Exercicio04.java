package Excecoes.Throws;

/*Desafio: Validação de Login com Throws

Objetivo: criar um método que valida usuário e senha, usando throw e throws.

Regras:

Crie um método validarLogin(String usuario, String senha) que lança uma exceção (throw) se:

usuario for diferente de "admin" → mensagem: "Usuário inválido!"

senha for diferente de "123" → mensagem: "Senha incorreta!"

O método deve usar throws Exception na assinatura.

        No main, chame o método dentro de um try/catch e trate a exceção mostrando a mensagem com .getMessage().

Se tudo estiver certo, imprima "Login efetuado com sucesso!".

Teste com:

Usuário e senha corretos

Usuário incorreto

Senha incorreta*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome de usuario correto: ");
        String usuario = teclado.nextLine();

        System.out.println("Digite a senha correta: ");
        String senha = teclado.nextLine();


        try{
            new Exercicio04().validarLogin(usuario, senha);
        } catch (Exception e) {
            System.out.println("Erro: " +  e.getMessage());

        }

        teclado.close();
    }

    public void validarLogin(String usuario, String senha) throws Exception{
        if(!usuario.equals("admin")) {
            throw new Exception("Ususário inválido!");
        }

        if(!senha.equals("123")) {
            throw new Exception("Senha incorreta!");
        }
        System.out.println("Login efetudado com sucesso!");
    }
}
