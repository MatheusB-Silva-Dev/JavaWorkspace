package TrabalhandoComArquivos.Desafios.SerializacaoComComposicao;

/*
  DESAFIO – SERIALIZAÇÃO COM COMPOSIÇÃO

Classe Produto: nome (String), preco (double)
Classe Pedido: id (String), produto (Produto) → Has-A
Classe PedidoSerialDemo (main):
- Criar Pedido com Produto
- Serializar em "Pedido.ser"
- Mensagem confirmando serialização
Bônus: Desserializar e imprimir id, nome e preço
*/

import java.io.*;

public class PedidoSerial {
    public static void main(String[] args) {
        //Criação do Produto
        // Produto é o objeto interno que será usado dentro do Pedido
        Produto produto = new Produto("XboxSeriesX", 2999);
        // Criação do Pedido
        // Pedido contém o Produto internamente (composição)
        Pedido pedido = new Pedido("123", produto);

        File outFile = new File("Pedido.ser");

        // Serialização usando try-with-resources
        // FileOutputStream cria o arquivo físico
        // ObjectOutputStream grava objetos serializáveis no arquivo
        try(FileOutputStream abrindo = new FileOutputStream(outFile);
        ObjectOutputStream gravando = new ObjectOutputStream(abrindo)) {

            gravando.writeObject(pedido);

            System.out.println("Arquivo serializado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: "  + e.getMessage());
        }
    }
}
