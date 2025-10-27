package collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //cria um LinkedHashMap para manter a ordem de inserção
        //chave: nome do produto String, Valor: preço do produto Double
        Map<String, Double> produtos = new LinkedHashMap<>();

        //loop para cadastrar 4 produtos
        for(int i = 1; i <=4; i++) {
            System.out.println("Digite o nome do produto: ");
            String nome = teclado.nextLine();

            System.out.println("Digite o preço do produto: ");
            Double preco = teclado.nextDouble();
            teclado.nextLine(); //limpa buffer do Scanner

            produtos.put(nome, preco); //adiciona o produto no LinkedHashMap

        }

        //exibe todos os produtos cadastrados
        for(Map.Entry<String, Double> entry: produtos.entrySet()){
            System.out.println("Produto: " + entry.getKey() + " Preço: " + entry.getValue());
        }

        //permite consultar o preço de um produto pelo nome
        System.out.println("Consulte o preço do produto pelo nome: ");
        String consultar = teclado.nextLine();

        if(produtos.containsKey(consultar)) { //verifica se o produto existe
            System.out.println("Preço do produto desejado: " + produtos.get(consultar));
        } else {
            System.out.println("Produto não cadastrado.");
        }

        //variaveis para encontrar o produto mais caro e mais barato
        String maisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;

        String maisBarato = null;
        double precoMaisBarato = Double.MAX_VALUE;

        //percorre todos os produtos para achar o mais caro e o mais barato
        for(Map.Entry<String, Double> entry : produtos.entrySet()) {
            String nome = entry.getKey();
            double preco = entry.getValue();

            if(preco > precoMaisCaro) {
                precoMaisCaro = preco;
                maisCaro = nome;
            }

            if(preco < precoMaisBarato) {
                precoMaisBarato = preco;
                maisBarato = nome;
            }
        }

        //imprime o produto mais caro e o mais barato
        System.out.printf("\nProduto mais caro: %s (R$ %.2f)%n", maisCaro, precoMaisCaro);
        System.out.printf("Produto mais barato: %s (R$ %.2f)%n", maisBarato, precoMaisBarato);

        teclado.close(); //fecha o scanner

    }
}
