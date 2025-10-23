package Threads.Desafio01;

public class MinhaTarefa implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            // Mostra qual thread está executando
            System.out.println("Mensagem da thread: " + Thread.currentThread().getName());

        }
    }
}
