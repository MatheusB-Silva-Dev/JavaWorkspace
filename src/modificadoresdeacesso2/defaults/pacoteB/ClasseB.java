package modificadoresdeacesso2.defaults.pacoteB;

import modificadoresdeacesso2.defaults.pacoteA.ClasseA;

public class ClasseB {
    public static void main(String[] args) {
        ClasseA classeA = new ClasseA();
        classeA.mostrarMensagem(); // ERRO: metodo não e público, acesso negado fora do pacote

    }
}
