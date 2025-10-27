package abstratas.exercicio03;

//usando heranca
public class Carro extends Veiculo {
    public Carro(String nome, int anoFabricacao, String modelo) {
        super(nome, anoFabricacao, modelo); // inicializa atributos da superclasse
    }

    // implementação específica do metodo abstrato
    @Override
    public String tipoDeVeiculo() {
        return "Automotivo";
    }
}
