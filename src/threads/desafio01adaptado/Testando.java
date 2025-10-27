package threads.desafio01adaptado;

public class Testando {
    public static void main(String[] args) {
        // cada thread com limite diferente
        Thread t1 = new Thread(new MinhaTarefa(5));
        t1.setName("Thread 1");
        t1.start();

        Thread t2 = new Thread(new MinhaTarefa(8));
        t2.setName("Thread 2");
        t2.start();
    }
}
