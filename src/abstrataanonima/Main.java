package AbstrataAnonima;

public class Main {
    public static void main(String[] args) {
        Mensagem mensagem = new Mensagem("Oi") {
            @Override
            public void enviar() {
                System.out.println("Mensagem enviada: " + this.conteudo);
            }
        };
        mensagem.enviar();
    }
}
