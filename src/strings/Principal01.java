package Strings;

public class Principal01 {
    public static void main(String[] args) {
        //As duas formas de declarar uma string, lembrando que uma String e um objeto e não um tipo primitivo
        /*String nome = new String("Matheus"); //Cria uma nova String sempre
        String nome1 = "Matheus"; //Verifica se ja tem uma identica na memoria, se não tiver ai sim cria uma nova string
        String s10 = nome;
        nome = nome.concat(" Silva");;

        System.out.println(nome);
        System.out.println(nome1);
        System.out.println(s10);

        //Comparando Referência de Objetos de String

        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";

        //== Compara a referencia na memoria
        System.out.println("Comparando S1 com S2");
        System.out.println(s1==s2);
        System.out.println("Comparando S1 com S3");
        System.out.println(s1==s3);
        System.out.println("Comparando S3 com S4");
        System.out.println(s3==s4);
        System.out.println("Comparando S1 com S4");
        System.out.println(s1==s4);

        //Metodos de Strings equals que compara efetivamente o conteudo
        String s51 = new String("Hello");
        String s62 = new String("Hello");
        String s73 = "Hello";
        String s84 = "Java";

        System.out.println("Comparando S51 e S62");
        System.out.println(s51.equals(s62));
        System.out.println("Comparando S51 e S73");
        System.out.println(s51.equals(s73));
        System.out.println("Comparando S73 e S84");
        System.out.println(s73.equals(s84));
        System.out.println("Comparando S51 a s84");
        System.out.println(s51.equals(s84));*/

        //Metodo char public charAt (int index) Esse método requer um argumento inteiro que indica a posição do caractere que o método retorna. Esse método retorna o caractere localizado no índice especificado da String. Lembre-se de que os índices de string são baseados em zero.
        String x = "Avião";
        System.out.println(x.charAt(2));

        //Metodo concat
        String y = "Autor";
        System.out.println(y.concat(" do livro"));

        //Os operadores + e += sobrecarregados executam funções semelhantes ao método concat () - por exemplo:

        String a = "Cartão";
        System.out.println(a+" de biblioteca");
        String b = "Estados";
        b+= " Unidos";
        System.out.println(b);

        //Metodo public boolean equalsIgnoreCase (String s) Este método retorna um valor booleano (verdadeiro ou falso), dependendo se o valor da String no argumento é o mesmo que o valor da String usado para invocar o método. Esse método retornará verdadeiro mesmo quando os caracteres nos objetos String comparados tiverem casos diferentes
        String c = "Sair";
        System.out.println(c.equalsIgnoreCase("SAIR"));
        System.out.println(c.equalsIgnoreCase("tixe"));

        //Metodo public int length () Esse método retorna o comprimento da String usada para invocar o método.
        String d = "01234567";
        System.out.println(d.length());

        //Metodo Substituição pública de String (char old, char new) Esse método retorna uma String cujo valor é o da String usada para chamar o método, atualizado para que qualquer ocorrência do caractere no primeiro argumento seja substituída pelo caractere no segundo argumento
        String e = "oxoxoxox";
        System.out.println(e.replace("x","X"));

        //substring public String (int begin) / substring public String (int begin, int end) primeiro argumento e baseado pelo indice 0, o ultimo começa pelo 1 O método substring () é usado para retornar uma parte (ou substring) da String usada para invocar o método. O primeiro argumento representa o local inicial (baseado em zero) da substring. Se a chamada tiver apenas um argumento, a substring retornada incluirá os caracteres no final da String original. Se a chamada tiver dois argumentos, a substring retornada terminará com o caractere localizado na enésima posição da String original, em que n é o segundo argumento. Infelizmente, o argumento final não é baseado em zero; portanto, se o segundo argumento for 7, o último caractere na String retornado estará na posição 7 da String original, que é o índice 6.
        String f = "0123456789";
        System.out.println (f.substring (5));
        System.out.println (f.substring (5, 8));

        // metodo public String toLowerCase() converte tudo para miniusculo Esse método retorna uma String cujo valor é a String usada para invocar o método, mas com qualquer caractere maiúsculo convertido em minúsculo
        String g = "Um novo livro Java";
        System.out.println(g.toLowerCase());

        //Metodo public String toUpperCase() converte tudo para maiusculo Esse método retorna uma String cujo valor é a String usada para chamar o método, mas com qualquer caractere minúsculo convertido em maiúsculo
        String h = "Um novo livro Java";
        System.out.println(h.toUpperCase());

        //Metodo public String trim () Esse método retorna uma String cujo valor é a String usada para invocar o método, mas com os espaços em branco à esquerda ou à direita removidos
        String j = "oi";
        System.out.println(j+"x");
        System.out.println(j.trim()+"x");

        //Metodo char public [] toCharArray () Este método produzirá uma matriz de caracteres a partir de caracteres do objeto String.
        String s = "Java";
        char[] arrayChar = s.toCharArray();

        //Metodo public boolean contains (“searchString”) Esse método retorna true do destino. A String está contendo a String de pesquisa fornecida no argumento.
        String m = "Java é uma linguagem de programação";
        System.out.println(m.contains("Matheus"));
        System.out.println(m.contains("Java"));
    }
}
