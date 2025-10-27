package strings;

public class Exercicio4 {

        public static void main(String[] args) {

            //TESTE COM STRING
            // Marca o tempo inicial em nanosegundos
            long inicioString = System.nanoTime();

            // String é imutável, então cada concatenação cria um novo objeto
            String texto = "";
            for (int i = 0; i < 10000; i++) {
                texto += i; // Ineficiente!
            }

            // Marca o tempo final
            long fimString = System.nanoTime();

            // Calcula e imprime o tempo gasto em milissegundos
            double tempoString = (fimString - inicioString) / 1_000_000.0;
            System.out.println("Tempo com String: " + tempoString + " ms");


            //TESTE COM STRINGBUILDER
            long inicioBuilder = System.nanoTime();

            // StringBuilder é mutável, ideal para manipular strings em um único thread
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 10000; i++) {
                builder.append(i); // Muito mais eficiente!
            }

            long fimBuilder = System.nanoTime();

            double tempoBuilder = (fimBuilder - inicioBuilder) / 1_000_000.0;
            System.out.println("Tempo com StringBuilder: " + tempoBuilder + " ms");


            //TESTE COM STRINGBUFFER
            long inicioBuffer = System.nanoTime();

            // StringBuffer também é mutável, mas é sincronizado (mais seguro em multi-threads)
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < 10000; i++) {
                buffer.append(i);
            }

            long fimBuffer = System.nanoTime();

            double tempoBuffer = (fimBuffer - inicioBuffer) / 1_000_000.0;
            System.out.println("Tempo com StringBuffer: " + tempoBuffer + " ms");


            System.out.println("\nConclusão:");
            System.out.println("- String é a mais lenta (por ser imutável).");
            System.out.println("- StringBuilder é a mais rápida (sem sincronização).");
            System.out.println("- StringBuffer é intermediária (síncrona, mas mais lenta que Builder).");
        }
}
