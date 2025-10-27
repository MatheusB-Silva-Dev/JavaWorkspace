package loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args){

        /*for(int i = 1; i<=5; i++){
            System.out.println(i);
        }*/

        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;

        //loop para processar 2 alunos
        for(int na = 1; na<=2; na++){
            System.out.println("Aluno " + na);

            //leitura das notas do aluno
            System.out.println("Digite a nota 1: ");
            nota1 = input.nextDouble();

            System.out.println("Digite a nota 2: ");
            nota2 = input.nextDouble();

            //calculo da média
            media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);
        }

        input.close(); // fecha Scanner
    }
}
