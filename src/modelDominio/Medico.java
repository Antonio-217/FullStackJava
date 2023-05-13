
package modelDominio;

import modelExecutaveis.PermitirAcesso;

public class Medico extends Usuario implements PermitirAcesso{
    
    private byte tokenMedico;
    private String formacao;
    private String login;
    private String senha;

    public Medico(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public byte getTokenMedico() {
        return tokenMedico;
    }

    public void setTokenMedico(byte tokenMedico) {
        this.tokenMedico = tokenMedico;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public boolean autenticar(String login, String senha) {
       this.login = login;
       this.senha = senha;
       return autenticar();
    }
    
    @Override
    public boolean autenticar() {
       
       return login.equals("admin") && senha.equals("admin");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
