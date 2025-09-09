package Composicao2;

public class Main {
    public static void main(String[] args) {
        Estante estante = new Estante();
        Livro livro = new Livro("Aventuras Do Matheus", "Matheus Silva", 1000);
        estante.adicionarLivro(livro);
        estante.listarLivros();

    }
}
