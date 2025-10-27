package excecoes.personalizadas.Desafio02;
/*
Desafio: Cadastro de Usuário com múltiplas validações
- Validar Nome, Idade e Email
- Criar exceções personalizadas para cada campo inválido
- Tratar exceções no metodo main usando try/catch
*/

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // bloco que pode gerar exceções de validação
        try {
            System.out.println("Digite seu nome: ");
            String nome = teclado.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = teclado.nextInt();
            teclado.nextLine(); //consome enter que ficou no buffer, para poder receber a entrada do email

            System.out.println("Digite seu email: ");
            String email = teclado.nextLine();

            // chamada de cada validação
            new CadastroUsuario().validaNome(nome);
            new CadastroUsuario().validaIdade(idade);
            new CadastroUsuario().validaEmail(email);

            // cada catch tratando sua propria exceção personalizada
        } catch (NomeInvalidoException e) {
            System.out.println("Erro " + e.getMessage());
        } catch (IdadeInvalidaExecption e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (EmailInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        teclado.close();

    }

    // os metodos de validação de cada exceção
    public void validaNome (String nome) throws NomeInvalidoException{
        if(nome == null) {
            throw new NomeInvalidoException("Nome nulo não permitido!");
        }

        if(nome.length() < 3) {
            throw new NomeInvalidoException("Nome como menos de 3 caracteres não permitido!");
        }
    }

    public void validaIdade(int idade) throws IdadeInvalidaExecption {
        if(idade < 18) {
            throw new IdadeInvalidaExecption("Idade menor que 18 não permitida!");
        }
    }

    public void validaEmail(String email) throws EmailInvalidoException {
        if(!email.contains("@")) {
            throw new EmailInvalidoException("Email não contém @!");
        }
    }
}
