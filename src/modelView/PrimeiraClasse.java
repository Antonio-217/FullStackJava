
package modelView;

import javax.swing.JOptionPane;

public class PrimeiraClasse {
    
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        
        for (int i = 0; i <= 4; i++) {
            
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+i+" ?");
            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+i+" ?");
            
            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));
            
            aluno1.getDisciplinas().add(disciplina);
        }
        
        int escolha = JOptionPane.showInternalConfirmDialog(null, "Deseja remover disciplinas?");
        
    }
    
}
