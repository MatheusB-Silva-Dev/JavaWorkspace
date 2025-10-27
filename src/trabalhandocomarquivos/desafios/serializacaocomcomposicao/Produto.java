package trabalhandocomarquivos.desafios.serializacaocomcomposicao;

import java.io.Serializable;

public class Produto implements Serializable {
    private String nome;
    private int preco;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }
}
