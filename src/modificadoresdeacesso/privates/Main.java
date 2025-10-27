package modificadoresdeacesso.privates;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contabancaria = new ContaBancaria();

        //acesso aos atributos privados é feito apenas pelos métodos públicos
        contabancaria.depositar(1000);
        contabancaria.sacar(500);
        contabancaria.exibirSaldo();

        // contabancaria.saldo = 500; // ERRADO: saldo e private gera erro
    }
}
