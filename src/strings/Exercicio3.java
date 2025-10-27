package strings;

public class Exercicio3 {
    //metodo que recebe rua cidade e estado e retorna uma String concatenada
    public static String formatarEndereco(String rua, String cidade, String estado) {
        return rua + cidade + estado;
    }

    public static void main(String[] args) {
        //chamo o metodo e guardo o resultado
        String resultado = formatarEndereco("Rua bela","Brasilia", "DF");
        System.out.println(resultado); // exibe o endereço
    }
}
