package classanonimas.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //criação de uma lista de numeros inteiros
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //criação de uma classe anonima que implementa a interface ListaInventada
        ListaInventada lista = new ListaInventada() {

            //atributo interno para armazenar os itens da lista
            private List<Integer> itens;

            //implementação do metodo da interface para retornar a quantidade de itens
            @Override
            public Integer quantidadeItens() {
                return this.itens.size();
            }

            //implementação do metodo da interface para definir os itens da lista
            @Override
            public void setItens(List<Integer> itens) {
                this.itens = itens;

            }
        };

        //define os itens da lista criada acima, lista = referencia a classe anonima que implementa lista inventada
        //setItens metodo implementado na classe anonima para setar os objetos numeros da lista concreta no atributo itens da classe anonima
        lista.setItens(numeros);

        //armazena o retorno do metodo quantidadeItens()
        Integer quantidade = lista.quantidadeItens();

        //exibe a quantidade total de itens na lista
        System.out.println("Quantidade: " + quantidade);
    }
}
