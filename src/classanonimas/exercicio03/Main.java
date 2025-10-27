package classanonimas.exercicio03;

public class Main {
    public static void main(String[] args) {

        //criando uma classe anonima que implementa a interface Tarefa
        Tarefa tarefa = new Tarefa() {
            String descricao; //atributo da classe anonima para armazenar a descrição

            //implementando o metodo definirDescricao
            @Override
            public void definirDescricao(String definir) {
                System.out.println("Inicio da descrição!");
                this.descricao = definir; // armazena o valor do parametro no atributo
            }

            //implementando o metodo mostrarDescricao
            @Override
            public void mostrarDescricao() {
                System.out.println("Descrição: " + this.descricao); //imprime a descrição armazenada
            }
        };

        //chamando o metodo da classe anonima para definir a descrição
        tarefa.definirDescricao("Estudar Java hoje a noite.");
        //chamando o metodo para mostrar a descrição no console
        tarefa.mostrarDescricao();

    }
}
