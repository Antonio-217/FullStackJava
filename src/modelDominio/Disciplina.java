package modelDominio;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {
    
    private double[] nota = new double[4];
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nota=" + nota + ", disciplina=" + disciplina + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Arrays.hashCode(this.nota);
        hash = 67 * hash + Objects.hashCode(this.disciplina);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (!Objects.equals(this.disciplina, other.disciplina)) {
            return false;
        }
        return Arrays.equals(this.nota, other.nota);
    }
    
    public double getMediaNotas(){
        double somaTotal = 0;
        
        for (int i = 0; i < nota.length; i++) {
            somaTotal += nota[i];
        }
        return somaTotal/4;
    }
    
}
