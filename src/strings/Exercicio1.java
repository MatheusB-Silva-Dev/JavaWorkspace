package Strings;

/*🧩 Desafio: Manipulando um nome com StringBuilder
Objetivo: Crie uma StringBuilder com seu nome completo e:

Adicione um título no início ("Sr. ", por exemplo).

Substitua o sobrenome por "Souza".

Inverta a string.

Exiba o resultado final.*/



public class Exercicio1 {
    public static void main(String[] args) {

        StringBuilder nome = new StringBuilder("Matheus");
        nome.insert(0, "Sr ");
        nome.replace(3, 10, "Silva");
        nome.reverse();

        System.out.println(nome);

    }
}
