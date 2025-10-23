package Threads.Facul2;

public class AnimalRunnable implements Runnable {

    @Override
    public void run() {
        for (int x = 1; x < 4; x++) {
            System.out.println("Executado por " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // a thread entra em TIMED_WAITING
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        // Mostrando o estado final da thread
        System.out.println("Estado da Thread: "
                + Thread.currentThread().getName()
                + " - " + Thread.currentThread().getState());

        System.out.println("Saída da Thread: " + Thread.currentThread().getName());
    }
}
