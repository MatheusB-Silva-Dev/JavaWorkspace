package CollectionsPT2.HashMap;

/*Mini Agenda com HashMap<String, String>
Objetivo:
Criar um programa simples que armazene e gerencie contatos, associando nomes a telefones usando um HashMap.

Passo a passo:
Criar um HashMap para armazenar contatos, onde a chave será o nome do contato (String) e o valor será o telefone (String).

Cadastrar 3 contatos:

Solicitar ao usuário que digite o nome do contato.

Solicitar o telefone correspondente para esse contato.

Armazenar esses dados no HashMap.

Exibir todos os contatos cadastrados, mostrando o nome e telefone de cada um.

Permitir que o usuário faça uma busca por nome:

Pedir que o usuário digite o nome do contato que deseja encontrar.

Verificar se o nome existe no HashMap.

        Se existir, mostrar o telefone associado.

        Caso contrário, informar que o contato não foi encontrado.*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, String> agenda = new HashMap<>();

        for(int i = 1; i <=3; i++){
            System.out.println("Digite o nome do contato: ");
            String nome = teclado.nextLine();

            System.out.println("Digite o número correspondente: ");
            String contato = teclado.nextLine();

            agenda.put(nome, contato);
        }

        System.out.println("Contatos cadastrados abaixo: ");
        for(Map.Entry<String, String> entry : agenda.entrySet()){
            System.out.println("Nome: " + entry.getKey() + " Contato: " + entry.getValue());
        }

        System.out.println("Digite o contato que deseja buscar: ");
        String busca = teclado.nextLine();

        if(agenda.containsKey(busca)) {
            System.out.println("Telefone de " + busca + ": " + agenda.get(busca));
        } else {
            System.out.println("Contato não encontrado.");
        }

        teclado.close();
    }
}
