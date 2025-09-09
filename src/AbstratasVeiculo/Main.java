package AbstratasVeiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro("Volkswagem Passat", 2009, "Sedã");
        String tipo = carro1.tipoDeVeiculo();
        System.out.println("Carro: " + carro1.nome + "\nFabricação: " + carro1.anoFabricacao + "\nModelo:  " + carro1.modelo);
        System.out.println("Tipo: " + tipo);

        System.out.println();

        Veiculo moto1 = new Moto("Honda CB 1000", 2020, "Duas rodas");
        String tipo2 = moto1.tipoDeVeiculo();
        System.out.println("Moto: " + moto1.nome + "\nFabricação: " + moto1.anoFabricacao + "\nModelo: " + moto1.modelo);
        System.out.println("Tipo: " + tipo2);
    }
}
