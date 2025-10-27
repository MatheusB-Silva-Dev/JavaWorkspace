package threads.facul.exercicio01;

public class TesteMinhaRunnable {

    public static void main (String [] args) {

        MinhaRunnable Minharunnable = new MinhaRunnable();

        //Passando o objeto Minharunnable para o construtor da classe Thread

        Thread t1 = new Thread(Minharunnable);

        t1.setName("Teste-1 Thread");

        //Tópico inicial t1

        t1.start();

        Thread t2 = new Thread(Minharunnable);

        t2.setName("Teste-2 Thread");

        t2.start();

    }



}