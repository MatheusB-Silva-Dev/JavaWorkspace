package Composicao2;

import java.util.ArrayList;
import java.util.List;

public class Estante {
    private List<Livro> livros;

    public Estante() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : this.livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Páginas: " + livro.getNumeroDePaginas());
            System.out.println();
        }
    }
}
