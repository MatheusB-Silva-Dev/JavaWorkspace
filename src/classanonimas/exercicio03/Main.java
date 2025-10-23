package ClassAnonimas3;

public class Main {
    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa() {
            String descricao;
            @Override
            public void definirDescricao(String descricao) {
                System.out.println("Inicio da descrição!");
                this.descricao = descricao;
            }

            @Override
            public void mostrarDescricao() {
                System.out.println("Descrição: " + this.descricao);

            }
        };

        tarefa.definirDescricao("Estudar Java hoje a noite.");
        tarefa.mostrarDescricao();

    }
}
