package excecoes.Throws;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome de usuario correto: ");
        String usuario = teclado.nextLine();

        System.out.println("Digite a senha correta: ");
        String senha = teclado.nextLine();

        try{
            //cria uma instância da classe para chamar o metodo
            Exercicio04 exercicio04 = new Exercicio04();
            //chama o metodo validarLogin() e passa os valores digitados
            exercicio04.validarLogin(usuario, senha);
        } catch (Exception e) {
            // Caso o metodo lance uma excecao, ela e capturada aqui
            // e a mensagem personalizada definida no throw e exibida
            System.out.println("Erro: " +  e.getMessage());
        }

        teclado.close(); //fecha o scanner
    }

    //metodo que valida as credenciais do usuario
    //caso o nome ou a senha estejam incorretos
    //lança uma exceção do tipo Exception com uma mensagem personalizada
    public void validarLogin(String usuario, String senha) throws Exception {
        //se o nome do usuário for diferente de admin lança exceção
        if(!usuario.equals("admin")) {
            throw new Exception("Ususário inválido!");
        }

        //se a senha for diferente de 123, lança exceção
        if(!senha.equals("123")) {
            throw new Exception("Senha incorreta!");
        }
        //se chegou ate aqui significa que os dados estão corretos
        System.out.println("Login efetudado com sucesso!");
    }
}
