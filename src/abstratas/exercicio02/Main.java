package abstratas.exercicio02;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente1 = new Gerente(1000); // Usamos a classe abstrata funcionario como molde e instaciamos a subclasse gerente
        double bonus = gerente1.getBonus(); // chama o metodo sobrescrito da subclasse
        gerente1.exibirSalario(); // metodo concreto da superclasse

        Funcionario desenvolvedor1 = new Desenvolvedor(2000); // Usamos a classe abstrata funcionario como molde e instaciamos a subclasse desenvolvedor
        double bonus1 = desenvolvedor1.getBonus(); // metodo sobrescrito da subclasse
        desenvolvedor1.exibirSalario(); // metodo concreto da superclasse

        System.out.println("Bônus do gerente: " + bonus);
        System.out.println("Bônus do desenvolvedor: " + bonus1);
    }

}
