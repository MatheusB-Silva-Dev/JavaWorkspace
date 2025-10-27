package abstrataanonima;

//define uma classe abstrata que não pode ser instanciada diretamente servindo como molde para outras classes
public abstract class Mensagem {
    //atributo que guarda o conteúdo da mensagem
    String conteudo;
    //construtor que inicializa o atributo conteudo quando uma subclasse ou instancia anonima e criada
    public Mensagem(String conteudo) {
        this.conteudo = conteudo;
    }

    //metodo abstrato sem implementação, obriga qualquer subclasse ou classe anonima a fornecer sua propria implementação
    public abstract void enviar();
}
