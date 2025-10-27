package heranca.exercicio01;

public class Main {
    public static void main(String[] args) {
        //criando objetos Moto
        Moto minhaMoto = new Moto("CG FAN 150", 2006, "2007");
        Moto minhaMoto1 = new Moto("Bros 150", 2009, "2010");

        //criando objeto Carro
        Carro meuCarro = new Carro("Gol", 2010, "2011");

        //testando Moto
        minhaMoto.ligarVeiculo();
        minhaMoto.desligarVeiculo();
        System.out.println("Moto: " + minhaMoto.nome + " | Ano: " + minhaMoto.anoFabricacao + " | Modelo: " + minhaMoto.modelo);
        System.out.println("Moto: " + minhaMoto1.nome + " | Ano: " + minhaMoto1.anoFabricacao + " | Modelo: " + minhaMoto1.modelo);
        System.out.println();

        //testando Carro
        meuCarro.ligarVeiculo();
        meuCarro.desligarVeiculo();
        System.out.println("Carro: " + meuCarro.nome + " | Ano: " + meuCarro.anoFabricacao + " | Modelo: " + meuCarro.modelo);
    }
}
