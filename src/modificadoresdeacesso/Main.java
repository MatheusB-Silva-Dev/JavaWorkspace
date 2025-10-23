package ModificadoresDeAcesso;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contabancaria = new ContaBancaria();
        contabancaria.depositar(1000);
        contabancaria.sacar(500);
        contabancaria.exibirSaldo();


    }
}
