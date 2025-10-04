package Threads.Facul2;

public class AnimalMultiThreadDemo {

    public static void main(String[] args) throws Exception {

        // Criando o objeto Runnable
        AnimalRunnable anr = new AnimalRunnable();

        Thread Gato = new Thread(anr);
        Gato.setName("Gato");

        Thread Cachorro = new Thread(anr);
        Cachorro.setName("Cachorro");

        Thread Vaca = new Thread(anr);
        Vaca.setName("Vaca");

        // Estado inicial (NEW)
        System.out.println("Estado da thread Gato antes de iniciar: " + Gato.getState());

        // Iniciando as threads
        Gato.start();
        Cachorro.start();
        Vaca.start();

        // Logo após iniciar (provavelmente RUNNABLE ou RUNNING dependendo do momento)
        System.out.println("Estado da thread Gato no método main antes de dormir: " + Gato.getState());
        System.out.println("Estado da thread Cachorro no método main antes de dormir: " + Cachorro.getState());
        System.out.println("Estado da thread Vaca no método main antes de dormir: " + Vaca.getState());

        // Espera 10 segundos para dar tempo das threads terminarem
        Thread.sleep(10000);

        // Depois de terminar, todas devem estar TERMINATED
        System.out.println("Estado da thread Gato após 10s: " + Gato.getState());
        System.out.println("Estado da thread Cachorro após 10s: " + Cachorro.getState());
        System.out.println("Estado da thread Vaca após 10s: " + Vaca.getState());
    }
}
