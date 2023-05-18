package threads;

import java.awt.Dimension;
import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
    
    public TelaTimeThread(){//Executa o que tiver dentro no momento da abertura ou execução
        setTitle("Tela de time com thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);
        
        
        setVisible(true);
    }
    
    
}
