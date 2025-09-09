package AbstratasVeiculo;

public class Moto extends Veiculo {
    public Moto(String nome, int anoFabricacao, String modelo) {
        super(nome, anoFabricacao, modelo);
    }

    @Override
    public String tipoDeVeiculo() {
        return "Motocicleta";
    }
}
