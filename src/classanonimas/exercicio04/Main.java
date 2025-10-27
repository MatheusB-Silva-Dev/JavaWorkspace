package classanonimas.exercicio04;

public class Main {
    public static void main(String[] args) {

        //classe anonima implementando a interface Notificacao para email
        Notificacao notificacaoEmail = new Notificacao() {

            //implementando o metodo enviar da interface Notificacao
            @Override
            public void enviar(String mensagem) {
                System.out.println("Enviado por email: " + mensagem);
            }
        };

        //classe anônima implementando a interface Notificacao para SMS
        Notificacao notificacaoSms = new Notificacao() {

            //implementando o mesmo metodo enviar da interface Notificacao
            @Override
            public void enviar(String mensagem) {
                System.out.println("Enviado por sms: " + mensagem);
            }
        };

        // Chamadas aos metodos implementados nas classes anonimas
        notificacaoEmail.enviar("Você recebeu um E-mail!"); // imprime mensagem de e-mail
        notificacaoSms.enviar("Você recebeu um SMS!"); // imprime mensagem de SMS
    }
}
