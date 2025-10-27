package composicao.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //classe Pedido contem itens composicao
    static class Pedido {
        private String identificador;
        private List<Item> itens; //lista de itens do pedido

        //construtor inicializa o ID e a lista de itens
        public Pedido(String identificador) {
            this.identificador = identificador;
            this.itens = new ArrayList<Item>();
        }

        //metodo para adicionar um item a lista
        public void addItem(Item item){
            this.itens.add(item);
        }

        //sobrescreve toString para exibir os nomes dos itens
        @Override
        public String toString() {
            String itens = "";
        for(Item item : this.itens) {
            itens += item.nome; //concatena os nomes dos itens
        }
            return itens;
        }

        //classe Item e estática e encapsula codigo nome e preço
        static class Item {
            private String codigo;
            private String nome;
            private double preco;
            
            public Item(String codigo, String nome, double preco) {
                this.codigo = codigo;
                this.nome = nome;
                this.preco = preco;
            } 
        }

        public static void main(String[] args) {
            //cria um pedido
            Pedido pedido = new Pedido("1231");
            //adiciona um item ao pedido
            pedido.addItem(new Item("Pão","Pão",2.90));
            //exibe os itens do pedido
            System.out.println(pedido.toString());
        }
    }
}
