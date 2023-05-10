
package modelFunction;

import modelView.PermitirAcesso;

public class FuncaoAutenticacao {
    
    public boolean autenticarUsuario(PermitirAcesso acesso){
        
        return acesso.autenticar();
    }
    
}
