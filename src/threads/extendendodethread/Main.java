package Threads.ExtendendoDeThread;

public class Main {
    public static void main(String[] args) {
        // Criamos uma instância da nossa classe que estende Thread
        MinhaThread thread = new MinhaThread();

        // Chamando start(), o método run será executado em outra thread
        thread.start();

        // Obs.: se chamássemos thread.run() diretamente, NÃO criaria uma nova thread
        System.out.println("Fluxo principal continua normalmente na main...");
    }

     // Obs.: Estender Thread não é recomendado porque limita a herança e quebra boas práticas de design.
    // O mais comum e flexível é usar Runnable.

}
