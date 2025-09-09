package AbstrataAnonima;

public abstract class Mensagem {
    String conteudo;

    public Mensagem(String conteudo) {
        this.conteudo = conteudo;
    }

    public abstract void enviar();
}
