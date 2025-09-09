import java.util.Scanner;

public class InstruçaoIfElseSwitch {
    public static void main (String[] ars){
        /*int valor = 8;

        if(valor == 9){
          System.out.println("Valor = 8");
        }
        else{
            System.out.println("Valor != 8");
        }*/

        /*Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite o valor da nota 1: ");
        nota1 = input.nextDouble();

        System.out.println("Digite o valor da nota 2: ");
        nota2 = input.nextDouble();

        System.out.println("Digite o valor da nota3: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media é igual a " + media);

        if(media>=7){
            System.out.println("Aprovado");
        }else if(media <4) {
            System.out.println("Rerovado");
        }else {
            System.out.println("Final");
        }*/

        int numero = 1;

        switch (numero) {
            case 1:
                System.out.println("Você digitou 1");
                break;

            case 2:
                System.out.println("Você digitou 2");
                break;
            case 3:
                System.out.println("Você digitou 3");
                break;

            default:
                System.out.println("Você digitou um valor invalido");

        }
    }
}
