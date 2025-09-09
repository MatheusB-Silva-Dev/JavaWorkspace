package Excecoes.Personalizadas.Facul;

import java.util.Scanner;

public class GerenciaConta {

    private float saldoAtual = 15000f; // saldo inicial da conta

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Por favor, insira um valor a ser acrescentado no seu saldo: ");
        float novoValor = inputDevice.nextFloat();

        try {
            // Tenta adicionar o valor ao saldo
            float valorTotal = new GerenciaConta().adicionaValor(novoValor);
            System.out.println("Valor total da conta = " + valorTotal);
        } catch (SaldoContaException e) {
            // Se exceder 20.000, cria um depósito fixo (FD) com o valor excedente
            float fdAmount = e.getSaldoConta() - 20000;
            System.out.println("Saldo excedeu 20.000! Criando FD de quantia: " + fdAmount);

            new GerenciaConta().criaDepositoFixo(fdAmount);
            System.out.println("Valor da conta = " + 20000);
        } finally {
            inputDevice.close();
        }
    }

    public float adicionaValor(float montante) throws SaldoContaException {
        float total = saldoAtual + montante;

        if (total > 20000) {
            throw new SaldoContaException(total); // lança exceção personalizada
        }

        return total;
    }

    public void criaDepositoFixo(float valorFixo) {
        // Implementação do depósito fixo (FD)
        System.out.println("Depósito Fixo criado no valor: " + valorFixo);
    }
}
