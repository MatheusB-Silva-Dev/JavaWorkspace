package abstratas.exercicio01;

/*
Demonstração de POO: abstração e heranca
Funcionario: classe abstrata, define atributo salario e metodo getBonus
Vendedor: subclasse de Funcionario, herda atributos e métodos
Main: instancia Vendedor e calcula bônus
*/

public class Main {
    public static void main(String[] args) {
        //Usamos a classe abstrata Funcionario como molde, mas vale notar que estamos instanciando a classe vendedor
        //mantendo assim a regra de que classes abstratas não podem ser instanciadas diretamente
        Funcionario vendedor1 = new Vendedor(1000); // Instancia passando o salario diretamente
        double bonus = vendedor1.getBonus(); // criamos uma variavel para armazenar o bonus e passamos o vendedor1
                                             //com salario de 1000 e chamamos na sequencia o getBonus para calcular 1000 * 1.5 = 1500
        System.out.println(bonus);
    }
}
