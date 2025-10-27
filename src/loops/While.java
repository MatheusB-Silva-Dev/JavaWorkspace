package loops;

public class While {
    public static void main (String[] args){

        int numero = 15;

        //não executa porque condição inicial é falsa
        while(numero <=14) {
            System.out.println(numero); // imprime valor atual
            numero++;
        }


        //exemplo de do-while: executa pelo menos uma vez
        do {
            System.out.println(numero);  // imprime valor atual
            numero++; // incrementa o número
        }while(numero <=16);  // repete enquanto a condição for verdadeira

    }
}
