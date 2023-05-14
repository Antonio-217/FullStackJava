package threads;

public class ThreadEX {
    
    public static void main(String[] args) throws InterruptedException {
        
        /**/
        for (int i = 0; i < 10; i++) {
            
            Thread.sleep(1000);//Da um tempo para o sistema
            //Quero executar esse envio com tempo determinado
            System.out.println("Executando alguma rotina, por exemplo envio de email");
        }
        System.out.println("Chegou ao fim do teste da thread");  
    }
    
}
