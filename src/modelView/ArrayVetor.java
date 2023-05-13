package modelView;

import javax.swing.JOptionPane;
import modelDominio.Aluno;
import modelDominio.Disciplina;

public class ArrayVetor {

    public static void main(String[] args) {
        //array pode ser de todos os tipos de dados e objetos também
        double[] notas = {8.8, 9.7, 7.6, 6.8};
        double[] notasLogica = {2.8, 1.7, 3.6, 6.8};
        //criação do aluno
        Aluno aluno = new Aluno();
        aluno.setSerieMatriculado("Programação java");
        aluno.setNomeEscola("Java Back-End");

        //criação da disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso java");
        disciplina.setNota(notas);

        aluno.getDisciplinas().add(disciplina);

        //criação da disciplina
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Logica de programação");
        disciplina2.setNota(notasLogica);

        aluno.getDisciplinas().add(disciplina2);

        //-------------------------------------------------------------
        Aluno[] ArrayAlunos = new Aluno[1];

        ArrayAlunos[0] = aluno;

        for (int i = 0; i < ArrayAlunos.length; i++) {

            System.out.println("Serie que o aluno está matriculado: " + ArrayAlunos[i].getSerieMatriculado());

            for (Disciplina d : ArrayAlunos[i].getDisciplinas()) {
                System.out.println("\nO nome da disciplina é: " + d.getDisciplina());

                for (int j = 0; j < d.getNota().length; j++) {
                    System.out.println("Essas foram as notas do aluno: " + d.getNota()[j]);
                }
            }
        }
        
        
        
        
        
        

        /*
        System.out.println("Serie matriculada = " + aluno.getSerieMatriculado() + " Inscrito no curso: " + aluno.getNomeEscola());
        System.out.println("\n--------Disciplina do aluno--------");

        for (Disciplina d : aluno.getDisciplinas()) {

            System.out.println("\nDisciplina: " + d.getDisciplina());
            System.out.println("\nAs notas da disciplina são: ");

            double notaMax = 0.0;
            for (int i = 0; i < d.getNota().length; i++) {
                System.out.println("Nota " + i + " é igual = " + d.getNota()[i]);

                if (i == 0) {
                    notaMax = d.getNota()[i];
                } else if (d.getNota()[i] > notaMax) {
                    notaMax = d.getNota()[i];
                }
            }
            System.out.println("A maior nota da disciplina = " + d.getDisciplina() + " e de valor = " + notaMax);

            double notaMin = 0.0;
            for (int i = 0; i < d.getNota().length; i++) {
                System.out.println("Nota " + i + " é igual = " + d.getNota()[i]);

                if (i == 0) {
                    notaMax = d.getNota()[i];
                } else if (d.getNota()[i] < notaMax) {
                    notaMax = d.getNota()[i];
                }
            }
            System.out.println("A menor nota da disciplina = " + d.getDisciplina() + " e de valor = " + notaMin);
        }

        String posicoes = JOptionPane.showInputDialog("Digite a quantidade de posições do array");

        //array deve sempre ter a quantidade de posições definidas
        double[] notas1 = new double[Integer.parseInt(posicoes)];

        for (int i = 0; i < notas1.length; i++) {
            String valor = JOptionPane.showInputDialog("Informe o valor para a posição " + i);
            notas1[i] = Double.valueOf(valor);
        }

        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Nota " + i + " é = " + notas1[i]);
        }

        
        
        
        
        //formas de atribuição de dados
        double um = 1, dois = 2, tres = 2;
        //1    2     3
        Double[] valores = {um, dois, tres};
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valores na posição " + i + " é igual = " + valores[i]);
        }

        String[] valores1 = new String[4];

        valores1[0] = "Antonio";
        valores1[1] = "18";
        valores1[2] = "antoniobuenas@gmail.com";
        for (int i = 0; i < valores1.length; i++) {
            System.out.println("Valores na posição " + i + " é igual = " + valores1[i]);
        }
         */
    }

}
