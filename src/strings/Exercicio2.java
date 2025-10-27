package strings;

public class Exercicio2 {
    public static void main(String[] args) {
        //Criando StringBuffer com a frase inicial
        StringBuffer frase = new StringBuffer("O carro está sujo e velho.");

        //substituo sujo por limpo indices 13 a 17
        frase.replace(13,17, "limpo");
        System.out.println(frase);// frase atualizada

        //velho por novo indices 21 a 26
        frase.replace(21,26,"novo");
        System.out.println(frase); // frase atualizada
    }
}

