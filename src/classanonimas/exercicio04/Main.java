package ClassAnonimas4;

public class Main {
    public static void main(String[] args) {

        Notificacao notificacaoEmail = new Notificacao() {
            @Override
            public void enviar(String mensagem) {
                System.out.println("Enviado por email: " + mensagem);
            }
        };

        Notificacao notificacaoSms = new Notificacao() {
            @Override
            public void enviar(String mensagem) {
                System.out.println("Enviado por sms: " + mensagem);
            }
        };

        notificacaoEmail.enviar("Você recebeu um E-mail!");
        notificacaoSms.enviar("Você recebeu um SMS!");
    }
}
