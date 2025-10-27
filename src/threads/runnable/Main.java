package threads.runnable;

public class Main {
    public static void main(String[] args) {
        MinhaRunnableThread tarefa = new MinhaRunnableThread(); //Cria um objeto da classe molde, só tem uma instância que sabe o que fazer (run()).
        Thread thread = new Thread(tarefa); //Cria a thread real que vai executar a tarefa.
        thread.start(); // dispara a execução da thread
    }
}

//Importante: não chamamos run() diretamente. start() cria a thread no sistema operacional e executa run() de forma paralela (ou simultânea ao fluxo da main).
