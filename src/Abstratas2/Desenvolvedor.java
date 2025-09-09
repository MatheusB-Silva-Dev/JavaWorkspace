package Abstratas2;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(double salario) {
        super(salario);
    }

    @Override
    public double getBonus() {
        return this.salario * 1.5;
    }
}
