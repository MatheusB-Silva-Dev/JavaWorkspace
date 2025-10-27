package modificadoresdeacesso.privates;

public class ContaBancaria {
    //O modificador 'private' impede que qualquer outra classe acesse esses atributos diretamente
    //Ex: contabancaria.saldo = 1000; // ERRO de compilação
    private String titular;
    private double saldo;

    // Getters e Setters permitem acesso controlado aos atributos privados
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodos da classe esses métodos também são públicos e permitem manipular os atributos privados de forma segura
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado, compensação em até 30 minutos! valor: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }

}
