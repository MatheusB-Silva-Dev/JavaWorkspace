package modificadoresdeacesso2.defaults.pacoteA;

public class ClasseA {
    //sem modificador público, o metodo 'mostrarMensagem' tem acesso 'default' (pacote)
     void mostrarMensagem(){
        System.out.println("Mensagem"); //so e acessível dentro do mesmo pacote
    }
}
