package ModificadoresDeAcesso3.Cachorro;

import ModificadoresDeAcesso3.Animal;

public class Cachorro extends Animal {
    public void definirEspecie(String especie) {
        this.especie = especie; // permitido: acesso direto na subclasse
    }

    public void exibirEspecie() {
        System.out.println("Espécie: " + this.especie);
    }
}
