package composicao.exercicio02;

//classe principal para testar a composição
public class Main {
    public static void main(String[] args) {
        //cria a estante
        Estante estante = new Estante();
        //cria um livro com titulo, autor e número de páginas
        Livro livro = new Livro("Aventuras Do Matheus", "Matheus Silva", 1000);
        //adiciona o livro a estante
        estante.adicionarLivro(livro);
        //lista todos os livros presentes na estante
        estante.listarLivros();
    }
}
