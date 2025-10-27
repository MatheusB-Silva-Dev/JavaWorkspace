package modificadoresdeacesso3.protecteds.cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        //acessando atributo protected feito via metodos publicos da subclasse
        cachorro.definirEspecie("Vira-lata");
        cachorro.exibirEspecie();
    }
}
