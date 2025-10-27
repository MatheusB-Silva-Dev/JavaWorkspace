package abstratas.exercicio01;

//classe que pratica heranca, vendedor e uma subclasse de funcionario herdando tudo
public class Vendedor extends Funcionario {
    //construtor que passa atributo salario da classe funcionario atraves da heranca
    public Vendedor(int salario) {
        super(salario); // aqui o super chama o construtor da superclasse funcionario, inicializando o atributo
    }
}
