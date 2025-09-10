package Excecoes.Personalizadas.Desafio04;

import java.util.Scanner;

// Código para demonstrar RuntimeException (unchecked exception) com try/catch:
// O programa captura exceções personalizadas sem quebrar a execução.
// O fluxo é protegido pelo try/catch, mesmo sendo RuntimeException.
// O finally garante que o Scanner seja fechado corretamente.

public class CadastroProduto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Try/catch envolve toda a leitura e validação para capturar exceções
        try{
            System.out.println("Digite o nome do produto: ");
            String nome = teclado.nextLine();

            System.out.println("Digite a quantidade do produto: ");
            int quantidade = teclado.nextInt();

            // forma menos valida de instaciar o metodo
            /*new CadastroProduto().validarNome(nome);
            new CadastroProduto().validarQuantidade(quantidade);*/

            // forma mais adequada que cria um unico objeto e instacia os metodos
            CadastroProduto cadastro = new CadastroProduto();
            cadastro.validarNome(nome);
            cadastro.validarQuantidade(quantidade);

            // Captura exceções de nome inválido e exibe a mensagem
        } catch (NomeProdutoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());           // catch (NomeProdutoInvalidoException | QuantidadeInvalidoException e) {
                                                                     //  System.out.println("Erro: " + e.getMessage()); } podemos fazer um catch dessa forma támbem
            // Captura exceções de quantidade inválida e exibe a mensagem
        } catch (QuantidadeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
            //finally sempre executado independete de exceção
        } finally {
            teclado.close();
        }
    }

    public void validarNome(String nome) {
        if(nome == null || nome.length() < 3) {
            throw new NomeProdutoInvalidoException("Nome do produto não pode ser nulo ou com menos de 3 caracteres!");
        } else {
            System.out.println(nome); // exibe o nome valido
        }
    }

    public void validarQuantidade(int quantidade) {
        if(quantidade < 0) {
            throw new QuantidadeInvalidoException("Quantidade do produto não pode ser negativo!");
        } else {
            System.out.println(quantidade); // exibe a quantidade valida
        }
    }
}
