package Excecoes.Throws;

public class Exercicio03 {
    public static void main(String[] args) {
        try {
            new Exercicio03().validarIdade(15);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void validarIdade(int idade) throws Exception {
        if (idade < 18) {
            throw new Exception("Idade menor que 18 não permitida!");
        }
        System.out.println("Idade válida: " + idade);
    }



}
