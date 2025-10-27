package classanonimas.exercicio01;

import java.util.List;

//Interface que define o contrato metodos obrigatorios que precisam ser implementados
public interface ListaInventada {

    //metodo que deve retornar a quantidade de itens, implementar onde quiser usar
    Integer quantidadeItens();

    //metodo que deve definir os itens da lista, implementar onde quiser usar
    void setItens(List<Integer> itens);
}

