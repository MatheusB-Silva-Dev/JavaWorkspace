package array;

public class Array {
    public static void main(String[] args){
        //Matriz unidimensional, Vetor ou array.Array

        //Forma crua de declaração de array de inteiros com tamanho 10
        int primeiroArray[] = new int[10];
        // alternativa: int[] primeiroArray = new int[10];

        //Atribui o valor no indice 0
        primeiroArray[0] = 56;

        // Imprime o valor do índice 0
        System.out.println(primeiroArray[0]);

        //Declaraçao e incialização dos conteudos na mesma linha
        String[] nome = {"Matheus", "Silva", "Bia", "Hortencia", "Maria"};
        int[] numeros = {1,2,3,4,5,6,7};

        System.out.println(nome[0]); // imprime "Matheus"
        System.out.println(numeros[1]); // imprime 2

         //Matriz ou Array multidimensionais

        // Declaração de array 3x3
        int tabela [][] = new int [3][3];

        tabela[0][0] = 1;
        tabela[0][1] = 2;
        tabela[0][2] = 3;
        tabela[1][0] = 4;
        tabela[1][1] = 5;
        tabela[1][2] = 6;
        tabela[2][0] = 7;
        tabela[2][1] = 8;
        tabela[2][2] = 9;

        System.out.println(tabela[0][0]); // imprime 1

        // Outra forma de declarar e inicializar array multidimensional
        int[][] table = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(table[2][1]); // imprime 8

        //Exercicios

        /*Desafio 1 – Array unidimensional simples
        Crie um array de 5 números inteiros. Atribua valores a cada índice e imprima:

        O primeiro elemento

        O último elemento

        O valor do elemento do meio (índice 2)*/

        int [] segundoArray = new int[5];

        segundoArray[0] = 1;
        segundoArray[1] = 2;
        segundoArray[2] = 3;
        segundoArray[3] = 4;
        segundoArray[4] = 5;

        System.out.println(segundoArray[0]); // primeiro elemento
        System.out.println(segundoArray[4]); // último elemento
        System.out.println(segundoArray[2]); // elemento do meio

        /*Desafio 2 – Array de Strings
        Crie um array de 4 nomes de frutas e imprima:

        A fruta no índice 1

        A fruta no índice 3*/

        String [] frutas = {"Maçã", "Banana", "Uva", "Goiaba"};

        System.out.println(frutas[1]);  // Banana
        System.out.println(frutas[3]); // Goiaba

        /*Desafio 3 – Array multidimensional
        Crie uma matriz 2x2 com os valores:

        { {10, 20},
          {30, 40} }
        Imprima:
        O valor na posição [0][1]
        O valor na posição [1][0]*/

        int [][] desafio = {
                {10,20},
                {30,40}
        };

        System.out.println(desafio[0][1]); // 20
        System.out.println(desafio[1][0]); // 30

        /*Desafio 4 – Atualização de valor
        No array multidimensional do desafio 3, altere o valor na posição [1][1] para 100 e imprima-o.*/

        desafio[1][1] = 100;
        System.out.println(desafio[1][1]); // 100

    }
}
