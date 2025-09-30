package TrabalhandoComArquivos.Desafios.SerializacaoComComposicao;

import java.io.Serializable;

public class Pedido implements Serializable {
    private String id;
    // Produto é um objeto dentro de Pedido (composição)
    // Não é um tipo especial, mas o fato de ser um objeto faz com que
    // ao serializar Pedido, o Produto interno seja serializado junto
    private Produto produto;

    public Pedido(String id, Produto produto) {
        this.id = id;
        this.produto = produto;
    }

    public String getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }
}
