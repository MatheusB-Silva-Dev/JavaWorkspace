package Abstratas2;

public class Gerente extends Funcionario {

    public Gerente(double salario) {
        super(salario);
    }

    public double getBonus() {
        return this.salario * 2;
    }
}
