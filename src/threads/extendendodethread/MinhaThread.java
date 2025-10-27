package threads.extendendodethread;

// Classe que estende diretamente Thread
class MinhaThread extends Thread {

    @Override
    public void run() {
        // Esse método será executado em paralelo quando chamarmos start()
        System.out.println("Trabalho importante sendo executado em MinhaThread!");
    }
}