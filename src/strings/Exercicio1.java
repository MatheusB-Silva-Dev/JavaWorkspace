package strings;

public class Exercicio1 {
    public static void main(String[] args) {

        //crio um StringBuilder
        StringBuilder nome = new StringBuilder("Matheus");

        //inserindo "Sr " no começo
        nome.insert(0, "Sr ");

        //substituindo os caracteres do índice 3 ao 10 por "Silva"
        nome.replace(3, 10, "Silva");

        //invertendo toda a String
        nome.reverse();

        //imprime o resultado final
        System.out.println(nome);

        // insert() adiciona sem apagar
        // replace() substitui um intervalo
        // reverse() inverte a string inteira

    }
}
