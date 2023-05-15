package threads;

import javax.swing.JOptionPane;

public class ThreadEX {
    
    public static void main(String[] args) throws InterruptedException {
        
        //c�digo da rotina que quero executar em paralelo
        for (int i = 0; i < 10; i++) {
            
            //Quero executar esse envio com tempo determinado
            System.out.println("Executando alguma rotina, por exemplo envio de email");
            Thread.sleep(1000);//Da um tempo para o sistema
        }
        //fim do c�digo em paralelo
        
        //c�digo do sistema do usu�rio continua o fluxo de trabalho
        System.out.println("Chegou ao fim o c�digo do teste da thread"); 
        //fluxo do sistema, exemplo um cadastro de venda
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio.");
    }
    
}
