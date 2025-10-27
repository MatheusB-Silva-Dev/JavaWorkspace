package heranca.exercicio01;

public class Veiculo {
    String nome;          // nome do veiculo
    int anoFabricacao;    // ano de fabricação
    String modelo;        // modelo do veículo

    //metodo para ligar
    public void ligarVeiculo() {
        System.out.println("Dando partida, ligado.....");
    }

    //metodo para desligar
    public void desligarVeiculo() {
        System.out.println("Desligando.....");
    }
}
