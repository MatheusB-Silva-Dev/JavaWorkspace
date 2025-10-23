package CollectionsPT2.LinkedHashMap;

        /*💡 Desafio: Cadastro de Produtos com Ordem Garantida
🎯 Objetivo:
Criar um programa que:

Cadastre 4 produtos (nome + preço) mantendo a ordem de inserção.

Exiba todos os produtos na mesma ordem em que foram inseridos.

Permita consultar o preço de um produto pelo nome.

Mostre o produto mais caro e o mais barato.

🧱 Estrutura do desafio:
Usar um LinkedHashMap<String, Double>

Chave: nome do produto

Valor: preço do produto

Inserir os 4 produtos com entrada via Scanner.

Percorrer com for-each (usando entrySet()) para:

Exibir todos os produtos

Encontrar o mais caro e o mais barato

Buscar produto pelo nome usando containsKey() e get()*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, Double> produtos = new LinkedHashMap<>();

        for(int i = 1; i <=4; i++) {
            System.out.println("Digite o nome do produto: ");
            String nome = teclado.nextLine();

            System.out.println("Digite o preço do produto: ");
            Double preco = teclado.nextDouble();
            teclado.nextLine();

            produtos.put(nome, preco);

        }

        for(Map.Entry<String, Double> entry: produtos.entrySet()){
            System.out.println("Produto: " + entry.getKey() + " Preço: " + entry.getValue());
        }

        System.out.println("Consulte o preço do produto pelo nome: ");
        String consultar = teclado.nextLine();

        if(produtos.containsKey(consultar)) {
            System.out.println("Preço do produto desejado: " + produtos.get(consultar));
        } else {
            System.out.println("Produto não cadastrado.");
        }

        String maisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;

        String maisBarato = null;
        double precoMaisBarato = Double.MAX_VALUE;

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

        System.out.printf("\nProduto mais caro: %s (R$ %.2f)%n", maisCaro, precoMaisCaro);
        System.out.printf("Produto mais barato: %s (R$ %.2f)%n", maisBarato, precoMaisBarato);

        teclado.close();

    }
}
