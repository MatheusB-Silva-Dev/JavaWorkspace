package abstratas.exercicio03;

//usando heranca
public class Moto extends Veiculo {
    public Moto(String nome, int anoFabricacao, String modelo) {
        super(nome, anoFabricacao, modelo); // inicializa atributos da superclasse
    }

    // implementação especifica do metodo abstrato
    @Override
    public String tipoDeVeiculo() {
        return "Motocicleta";
    }
}
