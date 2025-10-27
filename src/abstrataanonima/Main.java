package abstrataanonima;

/*
Exemplo de uso de classe abstrata com classe anonima

Mensagem: classe abstrata com atributo 'conteudo' e metodo abstrato 'enviar'
Main: cria uma instância anônima de Mensagem, implementando o metodo enviar
Demonstra abstração, polimorfismo e classes anonimas
 */


public class Main {
    public static void main(String[] args) {
        //criamos classes anonimas pois classes abstratas não podem ser instanciadas diretamente

        Mensagem mensagem = new Mensagem("Oi") { //classe anonima passando uma string para o atributo conteudo
            @Override // anotação para sobscrever um metodo da superclasse abstrata Mensagem, não e obrigatorio mas e boa pratica
            public void enviar() { //implementando o metodo abstrato notando polimorfismo aqui
                System.out.println("Mensagem enviada: " + this.conteudo); //imprimindo no console + atributo
            }
        };

        //segunda classe anonima
        Mensagem mensagem1 = new Mensagem("Demonstrando polimorfismo!") { //exemplo claro de polimorfismo, mesmo metodo se comportando de forma diferente
            @Override
            public void enviar() { // nova implementação do metodo enviar
                System.out.println("Teste: " + this.conteudo);
            }
        };
        //chamando os metodos
        mensagem.enviar();
        mensagem1.enviar();
    }
}
