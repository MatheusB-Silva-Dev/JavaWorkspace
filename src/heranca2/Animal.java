package heranca2;

/*1. Herança
Crie uma classe base chamada Animal com um método fazerSom() que imprime uma mensagem genérica.

Crie subclasses Cachorro e Gato que herdam de Animal e sobrescrevem o método fazerSom() para imprimir “Au au” e “Miau”, respectivamente.

Na classe Main, crie objetos dessas subclasses e chame fazerSom() para cada um.*/



public class Animal {
    public void fazerSom() {
        System.out.println("Fazendo som");
    }
}
