package abstratas.exercicio03;


public class Main {
    public static void main(String[] args) {
        // instanciando um carro usando a superclasse como referencia passando todos os atributos
        Veiculo carro1 = new Carro("Volkswagem Passat", 2009, "Sedã");
        String tipo = carro1.tipoDeVeiculo(); // chama metodo da subclasse Carro
        //imprime todos os atributos no consolde
        System.out.println("Carro: " + carro1.nome + "\nFabricação: " + carro1.anoFabricacao + "\nModelo:  " + carro1.modelo);
        System.out.println("Tipo: " + tipo); // imprime o tipo do veiculo

        System.out.println();

        // instanciando um carro usando a superclasse como referencia e passando todos os atributos
        Veiculo moto1 = new Moto("Honda CB 1000", 2020, "Duas rodas");
        String tipo2 = moto1.tipoDeVeiculo();// chama metodo da subclasse Moto
        System.out.println("Moto: " + moto1.nome + "\nFabricação: " + moto1.anoFabricacao + "\nModelo: " + moto1.modelo);
        System.out.println("Tipo: " + tipo2); // imprime o tipo do veiculo
    }
}
