package ClassAnonimas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        ListaInventada lista = new ListaInventada() {

            private List<Integer> itens;

            @Override
            public Integer quantidadeItens() {
                return this.itens.size();
            }

            @Override
            public void setItens(List<Integer> itens) {
                this.itens = itens;

            }
        };
        lista.setItens(numeros);
        Integer quantidade = lista.quantidadeItens();

        System.out.println(quantidade);
    }
}
