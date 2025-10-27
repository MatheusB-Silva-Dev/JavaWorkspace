package modificadoresdeacesso3.protecteds.cachorro;

import modificadoresdeacesso3.protecteds.Animal; //para acessar a superclasse

//Subclasse de Animal
public class Cachorro extends Animal {
    // Acesso direto ao atributo protected da superclasse
    public void definirEspecie(String especie) {
        this.especie = especie; // permitido: subclasse pode acessar atributo protected
    }

    //metodo publico para exibir o atributo
    public void exibirEspecie() {
        System.out.println("Espécie: " + this.especie);
    }
}
