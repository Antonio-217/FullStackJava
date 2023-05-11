package modelDominio;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public double getMediaNota(){
        double somaNotas = 0.0;
        
        for (Disciplina disciplina: disciplinas) {
            somaNotas += disciplina.getMediaNotas();
       
        }
        return somaNotas/disciplinas.size();
    }
    
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >= 70) {
            return true;
        } else {
            return false;
        }
    }
    
}
