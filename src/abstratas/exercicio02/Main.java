package Abstratas2;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente1 = new Gerente(1000);
        double bonus = gerente1.getBonus();
        gerente1.exibirSalario();

        Funcionario desenvolvedor1 = new Desenvolvedor(2000);
        double bonus1 = desenvolvedor1.getBonus();
        desenvolvedor1.exibirSalario();

        System.out.println("Bônus do gerente: " + bonus);
        System.out.println("Bônus do desenvolvedor: " + bonus1);



    }

}
