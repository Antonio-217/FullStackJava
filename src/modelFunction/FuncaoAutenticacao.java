
package modelFunction;

import modelExecutaveis.PermitirAcesso;

public class FuncaoAutenticacao {
    
    public boolean autenticarUsuario(PermitirAcesso acesso){
        
        return acesso.autenticar();
    }
    
}
