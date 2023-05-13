
package modelView;

import javax.swing.JOptionPane;
import modelDominio.Aluno;
import modelDominio.Disciplina;

public class ArrayVetor {
    
    public static void main(String[] args) {
        //array pode ser de todos os tipos de dados e objetos tamb√©m
        double[] notas = {8.8, 9.7, 7.6, 6.8};
        double[] notasLogica = {2.8, 1.7, 3.6, 6.8};
        //cria√ß√£o do aluno
        Aluno aluno = new Aluno();
        aluno.setSerieMatriculado("Antonio Carlos Bueno");
        aluno.setNomeEscola("Java Back-End");
        
        //cria√ß√£o da disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso java");
        disciplina.setNota(notas);  
        
        aluno.getDisciplinas().add(disciplina);
        
        //cria√ß√£o da disciplina
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Logica de programaÁ„o");
        disciplina2.setNota(notasLogica);  
        
        aluno.getDisciplinas().add(disciplina2);
        
        System.out.println("Serie matriculada = "+aluno.getSerieMatriculado()+" Inscrito no curso: "+aluno.getNomeEscola());
        System.out.println("\n--------Disciplina do aluno--------");
        
        for (Disciplina d : aluno.getDisciplinas()) {
            
            System.out.println("\nDisciplina: "+d.getDisciplina());
            System.out.println("\nAs notas da disciplina s„o: ");
            
            double notaMax = 0.0;
            for (int i = 0; i <d.getNota().length; i++) {
                System.out.println("Nota "+i+" È igual = "+d.getNota()[i]);
                
                if (i == 0) {
                    notaMax = d.getNota()[i];
                } else if(d.getNota()[i] > notaMax){
                         notaMax = d.getNota()[i]; 
                }
            }
            System.out.println("A maior nota da disciplina = "+d.getDisciplina()+" e de valor = "+notaMax);
            
            double notaMin = 0.0;
            for (int i = 0;i<d.getNota().length; i++) {
                System.out.println("Nota "+i+" È igual = "+d.getNota()[i]);
                
                if (i == 0) {
                    notaMax = d.getNota()[i];
                } else if(d.getNota()[i] < notaMax){
                         notaMax = d.getNota()[i]; 
                }
            }
            System.out.println("A menor nota da disciplina = "+d.getDisciplina()+" e de valor = "+notaMin);
        }
        
        
        
        
        
        
        String posicoes = JOptionPane.showInputDialog("Digite a quantidade de posiÁıes do array");
        
        //array deve sempre ter a quantidade de posi√ß√µes definidas
        double [] notas1 = new double[Integer.parseInt(posicoes)];
        
        for (int i = 0; i < notas1.length; i++) {
            String valor = JOptionPane.showInputDialog("Informe o valor para a posiÁ„o "+i);
            notas1[i] = Double.valueOf(valor);
        }     
        
        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Nota "+i+" È = "+notas1[i]);
        }
        
        
        
        //formas de atribui√ß√£o de dados
        
        double um=1, dois=2, tres=2;
                          //1    2     3
        Double[] valores = {um, dois, tres};
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valores na posiÁ„o "+i+" È igual = "+valores[i]);
        }
        
        
        String[] valores1 = new String[4];
        
        valores1[0] = "Antonio";
        valores1[1] = "18";
        valores1[2] = "antoniobuenas@gmail.com";
        for (int i = 0; i < valores1.length; i++) {
            System.out.println("Valores na posiÁ„o "+i+" È igual = "+valores1[i]);
        }
        
        
    }
    
}
