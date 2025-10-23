package Strings;

    import java.util.Date;


import java.sql.Timestamp;
  /*Classe StringBuffer / StringBuilder

    No Java String, objetos imutáve significam que, uma vez criado, ele não pode ser alterado, a referência aponta para um novo objeto.
    Se nosso aplicativo tiver atividade de manipulação de strings, haverá muitos objetos de strings descartados na memória heap, que podem resultar em impacto no desempenho.
    Para contornar essas limitações, você pode usar a classe StringBuilder ou StringBuffer.
    Você usa uma dessas classes, que são alternativas à classe String, quando você sabe que uma String será modificada;
    geralmente, você pode usar um objeto StringBuilder ou StringBuffer em qualquer lugar em que usaria uma String. StringBuffer pode ter caracteres e substrings inseridos no meio ou anexados ao final.
    O StringBuffer cresce automaticamente para abrir espaço para essas adições e geralmente possui mais caracteres pré-alocados do que o necessário para permitir espaço para crescimento.
    Semelhante à classe String, essas duas classes fazem parte do pacote java.lang e são importadas automaticamente para todos os programas. As classes são idênticas, exceto pelo seguinte:

    StringBuilder é mais eficiente.
    StringBuffer é seguro para threads devido a todos os métodos sincronizados.*/

    public class StringComparePerformance{


        public static void main(String[] args){


            Date sData=new Date();


            long sTempo=sData.getTime();


            System.out.println("Hora de início do StringBuffer: "+new Timestamp(sTempo));


            StringBuffer s = new StringBuffer("AA");


            for(int i=0; i<10000; i++){


                s.append(i);


            }


            Date eData=new Date();


            long eTempo=eData.getTime();


            System.out.println("Fim do tempo do StringBuffer: "+new Timestamp(eTempo));


            System.out.println("Tempo gasto para executar StringBufferprocess " + (eTempo-sTempo)+ "ms");


            System.out.println("=====================================================================");


            Date strData=new Date();


            long strTime=strData.getTime();


            System.out.println("Hora de início para String: "+new Timestamp(strTime));


            String str=new String("AA");


            for(int i=0; i<10000; i++){


                str+=i;


            }


            Date eStrDate=new Date();


            long eStrTime=eStrDate.getTime();


            System.out.println("Fim do tempo para String: "+new Timestamp(eStrTime));


            System.out.println("Tempo gasto para executar Stringprocess "+(eStrTime-strTime)+ "ms");


        }


    }





