package AbstratasVeiculo;

public class Carro extends Veiculo {
    public Carro(String nome, int anoFabricacao, String modelo) {
        super(nome, anoFabricacao, modelo);
    }

    @Override
    public String tipoDeVeiculo() {
        return "Automotivo";
    }
}
