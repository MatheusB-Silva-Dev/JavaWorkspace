package abstratas.exercicio02;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(double salario) {
        super(salario); // chama o construtor da superclasse
    }

    // implementação específica do metodo abstrato, polimorfismo
    @Override
    public double getBonus() {
        return this.salario * 1.5;
    }
}
