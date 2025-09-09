package AbstratasVeiculo;

abstract public class Veiculo {
    String nome;
    int anoFabricacao;
    String modelo;

    public Veiculo(String nome, int anoFabricacao, String modelo) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
    }

    public void ligarVeiculo() {
        System.out.println("Ligando.......");
    }

    public void desligarVeiculo() {
        System.out.println("Desligando.....");
    }

    public abstract String tipoDeVeiculo();
}
