package threads.runnable;

class MinhaRunnableThread implements Runnable {
    @Override
    public void run() { //é o ponto de entrada da Thread, ou seja, tudo dentro dele é o que a thread fará quando for iniciada.
        System.out.println("Thread em execução!");
    }
}

