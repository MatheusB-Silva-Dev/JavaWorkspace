package metodos;

public class PooMetodos {
    public static void main(String[] args) {
        //chama metodo que concatena duas strings e imprime o resultado
        System.out.println(concatenaDuasStrings("Matheus", "Silva"));

        //chama metodo que exibe mensagem no console sem retorno
        exibeMensagemNoConsole();

        //chama metodo que soma dois números
        System.out.println(soma(10, 10));

        //chama metodo que multiplica dois números
        System.out.println(multiplica(5, 7));

        //testa metodo que verifica maioridade
        System.out.println(ehMaiorDeIdade(16));
        System.out.println(ehMaiorDeIdade(21));

        //chama metodo que exibe saudação personalizada
        saudacao("Matheus");

    }
    //forma de declarar metodo com retorno
    public static String concatenaDuasStrings(String a, String b){
        return a + b;
    }

    //forma de declara metodo sem retorno
    public static void exibeMensagemNoConsole(){
        System.out.println("mensagem");
    }

    //metodo com retorno que multiplica dois números inteiros
    public static int soma(int a, int b) {
        return a + b;
    }

    /*Desafio 1 — Metodo que multiplica
    Crie um metodo chamado multiplica que receba dois números inteiros e retorne a multiplicação deles.
    No main, chame esse metodo com os valores 5 e 7 e imprima o resultado.*/

    public static int multiplica(int a, int b) {
        return a * b;
    }

    /*Desafio 2 — Metodo que verifica maioridade
    Crie um metodo chamado ehMaiorDeIdade que receba um número inteiro representando a idade e retorne true se a
    idade for maior ou igual a 18, ou false caso contrário.
    No main, teste com as idades 16 e 21 e imprima os resultados.*/

    public static boolean ehMaiorDeIdade (int a) {
        if(a >=18){
            return true;
        }else{
            return false;
        }
    }

    /*Desafio 3 — Metodo que exibe saudação personalizada
    Crie um metodo chamado saudacao que receba uma String com o nome da pessoa e imprima uma mensagem no console, tipo:
            "Olá, <nome>! Seja bem-vindo(a)."
    No main, chame o metodo com seu nome.*/

    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");
    }

}
