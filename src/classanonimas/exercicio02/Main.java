package classanonimas.exercicio02;

public class Main {
    public static void main(String[] args) {
        //classe anonima que implementa a interface OperacaoMatematica para somar
        OperacaoMatematica somar = new OperacaoMatematica() {
            @Override
            public int operar(int a, int b) {  //implementação do metodo operar
                return a + b; //retorna a soma dos dois valores
            }
        }; //polimorfismo acontecendo nas tres classes anonimas

        //Classe anonima que implementa a interface OperacaoMatematica para subtrair
        OperacaoMatematica subtrair = new OperacaoMatematica() {
            @Override
            public int operar(int a, int b) {
                return a - b;
            }
        };

        //Classe anonima que implementa a interface OperacaoMatematica para multiplicar
        OperacaoMatematica multiplica = new OperacaoMatematica() {
            @Override
            public int operar(int a, int b) {
                return a * b;
            }
        };


        //usa as referencias para chamar os métodos implementados nas classes anônimas e passa os valores
        System.out.println("Somar: " + somar.operar(15, 15));
        System.out.println("Subtrair: " + subtrair.operar(10, 2));
        System.out.println("Multiplicar: " + multiplica.operar(5, 5));


    }
}
