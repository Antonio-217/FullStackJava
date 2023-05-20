package threads;

import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplementacaoFilaThread extends Thread {/*para usar todos os recursos de thread precisa ser "extendida"*/

    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilhaFila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread) {
        pilhaFila.add(objetoFilaThread);
    }
    
    @Override
    public void run() {
        System.out.println("Fila rodando");

        while (true) {
            synchronized (pilhaFila) { /*Bloquear o acesso a esta lista por outro processo*/
        
        /*Um Iterator é um objeto que pode ser usado para percorrer coleções, como ArrayList e HashSet. 
        É chamado de "iterador" porque é "iterativo" é o termo técnico para loop.*/
        Iterator iteracao = pilhaFila.iterator();
                
                while (iteracao.hasNext()) {
                    /*enquanto tiver dados na lista irá processar*/

                    ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
                    /*pega o objeto atual*/

                    //processar 10.000 notas fiscais
                    //gerar uma lista de PDF
                    //enviar uma quantidade enorme de email
                    System.out.println("-----------------------");
                    System.out.println(processar.getNome());
                    System.out.println(processar.getEmail());

                    iteracao.remove();
                    try {
                        Thread.sleep(1000);
                        /*dar um tempo para descarga de memória*/
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();/*processou toda lista, da mais um tempo pra limpeza de memória*/
            }
        }

    }

}
