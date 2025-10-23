package Abstratas;

public class Main {
    public static void main(String[] args) {
        Funcionario vendedor1 = new Vendedor(1000);
        double bonus = vendedor1.getBonus();
        System.out.println(bonus);
    }
}
