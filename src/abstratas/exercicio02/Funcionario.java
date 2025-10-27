package abstratas.exercicio02;

abstract public class Funcionario {
    double salario; // atributo que guarda o salário do funcionário

    public Funcionario(double salario) {
        this.salario = salario; // inicializa o salário ao criar uma subclasse
    }

    // metodo abstrato cada subclasse vai implementar de forma diferente
    public abstract double getBonus();

    public void exibirSalario() { // metodo concreto exibe o salario no console
        System.out.println(this.salario);
    }
}
