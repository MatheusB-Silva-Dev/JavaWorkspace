package Strings;

/*🧩 Desafio 2 — Substituições múltiplas
📌 Use StringBuffer.

Requisitos:

Crie um StringBuffer com a frase: "O carro está sujo e velho."

Substitua "sujo" por "limpo".

Substitua "velho" por "novo".

Imprima a frase atualizada.*/

public class Exercicio2 {
    public static void main(String[] args) {
        StringBuffer frase = new StringBuffer("O carro está sujo e velho.");
        frase.replace(13,17, "limpo");
        System.out.println(frase);
        frase.replace(21,26,"novo");
        System.out.println(frase);
    }
}

/*🧩 Tabela de Métodos — StringBuilder / StringBuffer
Método	Descrição
append(String str)	Adiciona texto ao final. Ex: sb.append("abc")
insert(int offset, String str)	Insere texto em uma posição específica. Ex: sb.insert(0, "Oi ")
replace(int start, int end, String str)	Substitui parte da string entre start e end por str
delete(int start, int end)	Remove parte da string entre start e end
deleteCharAt(int index)	Remove o caractere na posição index
reverse()	Inverte a ordem dos caracteres
length()	Retorna o comprimento atual da string
capacity()	Retorna a capacidade atual do buffer
setLength(int newLength)	Define manualmente o comprimento do texto
charAt(int index)	Retorna o caractere na posição indicada
setCharAt(int index, char ch)	Altera o caractere na posição index por ch
toString()	Converte para uma String padrão Java
indexOf(String str)	Retorna a posição da primeira ocorrência de str
lastIndexOf(String str)	Retorna a última ocorrência de str
substring(int start)	Retorna parte da string a partir de start
substring(int start, int end)	Retorna parte da string entre start e end
ensureCapacity(int min)	Garante que a capacidade seja de pelo menos min
trimToSize()	Reduz a capacidade ao comprimento atual da string*/