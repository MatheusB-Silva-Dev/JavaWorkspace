package TrabalhandoComArquivos.Facul.RelacionamentoDeSerializaçãoComComposiçãoHasA;

import java.io.*;

// Classe Departamento (objeto interno de NovoFuncionario)
class Departamento implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;

    public Departamento() {
        this.nome = "TI"; // exemplo de inicialização
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}