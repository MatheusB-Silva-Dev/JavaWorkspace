package abstratas.exercicio01;

//classe abstrata que não pode ser instanciada diretamente serve como molde para subclasses
abstract public class Funcionario {
    //atributo
    int salario;

    //construtor que inicializa o atributo quando uma subclasse e criada
    public Funcionario(int salario){
        this.salario = salario;
    }

    //metodo concreto que calcula o bonus
    public double getBonus() {
        return this.salario * 1.5;
    }
}
