package threads;

import javax.swing.JOptionPane;

public class ExemploThread {

    public static void main(String[] args) throws InterruptedException {

        //thread processamento paralelo de envio do emails
        Thread threadEmail = new Thread(thread1);
        threadEmail.start();
        
        Thread threadNfce = new Thread(thread2);
        threadNfce.start();

        //código do sistema do usuário continua o fluxo de trabalho
        System.out.println("Chegou ao fim o código do teste da thread");
        //fluxo do sistema, exemplo um cadastro de venda
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário.");
    }

    private static Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            //thread processando em paralelo do envio de NFCe
            new Thread() {
                public void run() { //executa o que nós queremos
                    //código da rotina que quero executar em paralelo
                    for (int i = 0; i < 10; i++) {
                        //Quero executar esse envio com tempo determinado
                        System.out.println("Executando alguma rotina, por exemplo envio de NFC-e");
                        try {
                            Thread.sleep(1000);//Da um tempo para o sistema
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //fim do código em paralelo 
                }
            }.start();//"start" liga a thread que fica processando paralelamente por trás
        }
    };

    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            //thread processando em paralelo do envio de email
            new Thread() {
                public void run() { //executa o que nós queremos
                    //código da rotina que quero executar em paralelo
                    for (int i = 0; i < 10; i++) {
                        //Quero executar esse envio com tempo determinado
                        System.out.println("Executando alguma rotina, por exemplo envio de email");
                        try {
                            Thread.sleep(2000);//Da um tempo para o sistema
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //fim do código em paralelo 
                }
            }.start();//"start" liga a thread que fica processando paralelamente por trás
        }
    };

}
