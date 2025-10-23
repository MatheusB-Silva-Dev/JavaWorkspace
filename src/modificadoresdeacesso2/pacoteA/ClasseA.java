package ModificadoresDeAcesso2.pacoteA;

/*🧩 Desafio 2 — Pacote e acesso default
Crie duas classes:

ClasseA em um pacote pacoteA

ClasseB em um pacote pacoteB

        Em ClasseA, declare um método void mostrarMensagem() sem nenhum modificador (default).

Tente chamar mostrarMensagem() a partir da ClasseB.

        ⚠️ Ponto de atenção:
Vai funcionar? Por quê? Lembre do modificador "default".*/

public class ClasseA {
    public void mostrarMensagem(){
        System.out.println("Mensagem");
    }
}
