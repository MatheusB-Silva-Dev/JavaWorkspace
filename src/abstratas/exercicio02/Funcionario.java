package Abstratas2;

abstract public class Funcionario {
    double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonus();
    public void exibirSalario() {
        System.out.println(this.salario);
    }
}
