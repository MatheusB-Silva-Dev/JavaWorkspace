package Composição;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static class Pedido {
        private String identificador;
        private List<Item> itens;

        public Pedido(String identificador) {
            this.identificador = identificador;
            this.itens = new ArrayList<Item>();
        }

        public void addItem(Item item){
            this.itens.add(item);
        }

        @Override
        public String toString() {
            String itens = "";
        for(Item item : this.itens) {
            itens += item.nome;
        }
            return itens;
        }

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
            Pedido pedido = new Pedido("1231");
            pedido.addItem(new Item("Pão","Pão",2.90));
            System.out.println(pedido.toString());
        }
    }
}
