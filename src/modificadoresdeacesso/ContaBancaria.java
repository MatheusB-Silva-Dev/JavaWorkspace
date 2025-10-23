package ModificadoresDeAcesso;

/*Desafio 1 — Visibilidade private
Crie uma classe ContaBancaria com os atributos:

private String titular

private double saldo

E os métodos:

public void depositar(double valor)

public void sacar(double valor)

public void exibirSaldo()

⚠️ Ponto de atenção:
Você conseguirá acessar os atributos diretamente no main? Se não, por quê?*/

public class ContaBancaria {
    private String titular;
    private double saldo;

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
