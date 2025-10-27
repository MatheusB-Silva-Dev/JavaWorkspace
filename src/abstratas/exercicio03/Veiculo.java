package abstratas.exercicio03;

//classe abstrata molde
abstract public class Veiculo {
    String nome; // nome do veiculo
    int anoFabricacao; // ano de fabricação
    String modelo; // modelo do veículo

    //construtor da superclasse
    public Veiculo(String nome, int anoFabricacao, String modelo) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
    }

    // metodo concreto liga o veiculo
    public void ligarVeiculo() {
        System.out.println("Ligando.......");
    }

    // metodo concreto desliga o veículo
    public void desligarVeiculo() {
        System.out.println("Desligando.....");
    }

    // metodo abstrato implementado pelas subclasses
    public abstract String tipoDeVeiculo();
}
