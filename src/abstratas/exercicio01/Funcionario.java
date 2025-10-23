package Abstratas;

abstract public class Funcionario {
    int salario;

    public Funcionario(int salario){
        this.salario = salario;
    }

    public double getBonus() {
        return this.salario * 1.5;
    }
}
