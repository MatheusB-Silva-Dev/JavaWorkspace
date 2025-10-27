package excecoes.personalizadas.Desafio03;

//codigo para destacar unchecked exception, mostrando que o codigo executa mesmo sem tratamento try catch ou uso do throws, difrente das exceções checked
public class CadastroProduto {
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);

        //defini os atributos diretamente para teste rapido, vale observar que nome aqui se restringe ao escopo da main
        //tem outros parametros com mesmo nome, deste atributo mas que se restringi a outros escopos, seja na main
        //no metodo e na classe de exceção NomeProdutoInvalido
        String nome = null;
        int quant = 1;

        //instanciando os metodos e passando os atributos que vem da main e caindo nos parametos dos metodos
        new CadastroProduto().validaNome(nome);
        new CadastroProduto().validaQuantidade(quant);

    }

    // metodo para validar nome
    public void validaNome(String nome) {
        if(nome == null || nome.length() < 3) {
            throw new NomeProdutoInvalidoException("Nome do produto não pode ser nulo!"); // dipara para o super
        } else {
            System.out.println(nome);
        }

    }

    // metodo para validar quantidade
    public void validaQuantidade(int quant) {
        if(quant < 0) {
            throw new QuantidadeInvalidoException("Quantidade não pode ser negativa!"); // dipara para o super
        } else {
            System.out.println(quant);
        }
    }
}
