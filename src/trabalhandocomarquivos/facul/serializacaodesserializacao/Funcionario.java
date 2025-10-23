package TrabalhandoComArquivos.Facul.SerializacaoDesserializacao;

import java.io.Serializable;

public class Funcionario implements Serializable {
    private String name;
    private String id;

    // Construtor
    public Funcionario(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Métodos de acesso (getters)
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
