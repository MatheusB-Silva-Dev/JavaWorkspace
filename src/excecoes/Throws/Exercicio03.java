package excecoes.Throws;

public class Exercicio03 {
    public static void main(String[] args) {
        try {
            // Chama o metodo validarIdade que lança uma Exception se idade < 18
            new Exercicio03().validarIdade(15);
        } catch (Exception e) {
            //captura a exceção lançada pelo metodo e imprime a mensagem
            System.out.println("Erro: " + e.getMessage());
        }
    }

    //metodo que valida a idade e lança uma checked Exception se menor que 18
    public void validarIdade(int idade) throws Exception {
        if (idade < 18) {
            //lança a exceção com a mensagem personalizada
            throw new Exception("Idade menor que 18 não permitida!");
        }
        //caso idade seja válida, imprime no console
        System.out.println("Idade válida: " + idade);
    }

}
