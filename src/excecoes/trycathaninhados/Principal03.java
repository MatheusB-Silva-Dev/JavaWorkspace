package excecoes.trycathaninhados;

import java.util.Scanner;

public class Principal03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //eitura do divisor para a divisão de 100
            System.out.println("Digite um número para dividir 100 por ele:");
            //le e converte string para inteiro
            int divisor = Integer.parseInt(scanner.nextLine());

            try {
                int resultado = 100 / divisor; // realiza divisão

                try {
                    //leitura de outro número para conversão
                    System.out.println("Digite um número para converter em inteiro:");
                    String textoNumero = scanner.nextLine();

                    int numero = Integer.parseInt(textoNumero); // converte string para inteiro
                    System.out.println("Número convertido: " + numero);

                } catch (NumberFormatException nfe) {
                    System.out.println("Erro: Formato numérico inválido!"); // trata entrada invalida
                }

                System.out.println("Resultado da divisão: " + resultado);  // exibe resultado da divisão

            } catch (ArithmeticException ae) {
                System.out.println("Erro: Divisão por zero não é permitida!");  // trata divisão por zero
            }

        } catch (Exception e) {
            System.out.println("Erro geral: " + e.getMessage());  // captura qualquer outra exceção
        }

        scanner.close(); // fecha Scanner
    }
}
