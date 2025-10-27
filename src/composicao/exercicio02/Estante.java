package composicao.exercicio02;

import java.util.ArrayList;
import java.util.List;

//classe Estante contem uma lista de livros composiçao
public class Estante {
    private List<Livro> livros;  //lista de livros na estante

    //construtor inicializa a lista
    public Estante() {
        this.livros = new ArrayList<>();
    }

    //adiciona um livro à lista
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    //lista todos os livros da estante
    public void listarLivros() {
        for (Livro livro : this.livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Páginas: " + livro.getNumeroDePaginas());
            System.out.println(); //linha em branco para separar os livros
        }
    }
}
