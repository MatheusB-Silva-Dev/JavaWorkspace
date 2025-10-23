package ClassAnonimas2;

public class Main {
    public static void main(String[] args) {
        OperacaoMatematica somar = new OperacaoMatematica() {
            @Override
            public int operar(int a, int b) {
                return a + b;
            }
        };

        OperacaoMatematica subtrair = new OperacaoMatematica() {
            @Override
            public int operar(int a, int b) {
                return a - b;
            }
        };
        OperacaoMatematica multiplica = new OperacaoMatematica() {
            @Override
            public int operar(int a, int b) {
                return a * b;
            }
        };

        System.out.println("Somar: " + somar.operar(15, 15));
        System.out.println("Subtrair: " + subtrair.operar(10, 2));
        System.out.println("Multiplicar: " + multiplica.operar(5, 5));


    }
}
