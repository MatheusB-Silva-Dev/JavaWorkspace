package heranca.exercicio02;

public class Main {
    public static void main(String[] args) {
        //instanciando as classes
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        //chamando o metodo sobrescrito em cada classe, polimorfismo
        cachorro.fazerSom();
        gato.fazerSom();
    }

}
