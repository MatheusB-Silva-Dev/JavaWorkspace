package ExeciciosDiversos;
/*1. Soma dos Pares
Crie um programa que:
        • 	Recebe 10 números inteiros do usuário
• 	Soma apenas os números pares
• 	Exibe o total ao final*/

import java.util.ArrayList;
import java.util.Scanner;

public class Diverso01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int i = 0;

        //Usei while para diversificar, pois sempre uso for
        while(i<10) {
            System.out.println("Digite um número: ");
            int num = teclado.nextInt();
            numeros.add(num);
            i++;
        }

        System.out.println(numeros);

        //Variavel inicializada em zero para acumular a soma
        int soma = 0;
        //Aqui usei for each para percorrer a lista
        for(int a: numeros){
            //If usado para verificar os numeros pares pois, todos tem que ter o resto da divisão zerado para ser par por isso usamos % == 0
            if(a % 2 == 0){
                //Aqui usamos a variavel soma para acumular soma + a, a significa os dados vindos da lista
                soma = soma + a;
                
            }
        }
        System.out.println(soma);
    }

}
