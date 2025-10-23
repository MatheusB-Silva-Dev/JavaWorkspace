package Strings;

/*🧩 Desafio 3 — Formatação dinâmica
📌 Use StringBuilder.

Requisitos:

Crie um método formatarEndereco(String rua, String cidade, String estado) que retorne:

Editar
Rua: <rua>
Cidade: <cidade>
Estado: <estado>
Use StringBuilder para construir a string formatada.

Teste com valores reais no main.*/


public class Exercicio3 {
    public static String formatarEndereco(String rua, String cidade, String estado) {
        return rua + cidade + estado;
    }

    public static void main(String[] args) {
        String resultado = formatarEndereco("Rua bela","Brasilia", "DF");
        System.out.println(resultado);
    }
}
