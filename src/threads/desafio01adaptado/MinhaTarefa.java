package Threads.Desafio01Adaptado;

public class MinhaTarefa implements Runnable {
    private int limite; // variável de instância, cada thread pode ter valor diferente

    // construtor que recebe o limite
    public MinhaTarefa(int limite) {
        this.limite = limite;
    }

    @Override
    public void run() {
        // Loop vai até o limite passado no construtor
        for (int i = 1; i <= limite; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " - Contagem: " + i);
        }
    }
}
