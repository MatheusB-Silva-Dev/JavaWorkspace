package Excecoes.Personalizadas.Facul;

// exceção personalizada para saldo de conta
public class SaldoContaException extends Exception {

    private float saldoConta; // armazena o saldo que excedeu o limite

    // Construtor que recebe o saldo e envia para a superclasse Exception
    public SaldoContaException(float f) {
        super(); // envia para a classe pai (Exception)
        this.saldoConta = f;
    }

    // Construtor com mensagem personalizada
    public SaldoContaException(String msg) {
        super(msg);
    }

    public float getSaldoConta() {
        return saldoConta;
    }
}
