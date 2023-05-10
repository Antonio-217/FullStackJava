
package modelDominio;

public class Paciente extends Usuario{
    
    private String doencaDiagnosticada;
    private String grauDoenca;

    public String getDoencaDiagnosticada() {
        return doencaDiagnosticada;
    }

    public void setDoencaDiagnosticada(String doencaDiagnosticada) {
        this.doencaDiagnosticada = doencaDiagnosticada;
    }

    public String getGrauDoenca() {
        return grauDoenca;
    }

    public void setGrauDoenca(String grauDoenca) {
        this.grauDoenca = grauDoenca;
    }
    
    
    
}
