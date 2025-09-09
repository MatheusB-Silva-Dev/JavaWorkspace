public class PooMetodos {
    public static void main(String[] args) {
        System.out.println(concatenaDuasStrings("Matheus", "Silva"));

        exibeMensagemNoConsole();

        System.out.println(soma(10, 10));

        System.out.println(multiplica(5, 7));

        System.out.println(ehMaiorDeIdade(16));
        System.out.println(ehMaiorDeIdade(21));

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

    public static int soma(int a, int b) {
        return a + b;
    }

    /*Desafio 1 — Método que multiplica
    Crie um método chamado multiplica que receba dois números inteiros e retorne a multiplicação deles.
    No main, chame esse método com os valores 5 e 7 e imprima o resultado.*/

    public static int multiplica(int a, int b) {
        return a * b;
    }

    /*Desafio 2 — Método que verifica maioridade
    Crie um método chamado ehMaiorDeIdade que receba um número inteiro representando a idade e retorne true se a idade for maior ou igual a 18, ou false caso contrário.
    No main, teste com as idades 16 e 21 e imprima os resultados.*/

    public static boolean ehMaiorDeIdade (int a) {
        if(a >=18){
            return true;
        }else{
            return false;
        }
    }

    /*Desafio 3 — Método que exibe saudação personalizada
    Crie um método chamado saudacao que receba uma String com o nome da pessoa e imprima uma mensagem no console, tipo:
            "Olá, <nome>! Seja bem-vindo(a)."
    No main, chame o método com seu nome.*/

    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");
    }

}
