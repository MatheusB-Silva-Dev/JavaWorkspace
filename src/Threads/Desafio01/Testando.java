package Threads.Desafio01;

public class Testando {
    public static void main(String[] args) throws InterruptedException {
        // Cria o objeto Runnable
        MinhaTarefa tarefa = new MinhaTarefa();

        // Cria a primeira thread passando o Runnable
        Thread t1 = new Thread(tarefa);
        t1.setName("Thread Principal"); // da nome a thread
        t1.start(); // inicia a execução da thread

        // Pausa curta na main apenas para ver saída ordenada
        Thread.sleep(500);

        // Cria a segunda thread usando o mesmo objeto Runnable
        Thread t2 = new Thread(tarefa);
        t2.setName("Thread Secundaria");
        t2.start();

    }

    // OBS: sleep() na main pausa a thread principal.
    // Se eu quisesse controlar o ritmo da thread, colocaria o sleep() dentro do run().

}
