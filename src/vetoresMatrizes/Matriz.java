package vetoresMatrizes;

public class Matriz {
    
    public static void main(String[] args) {
     
        int notas[][] = new int[2][3];
        
        notas[0][0] = 30;
        notas[0][1] = 40;
        notas[0][2] = 50;
        
        notas[1][0] = 60;
        notas[1][1] = 70;
        notas[1][2] = 80;
        
        //percorrendo a matriz parecido com o excel linhas X colunas
        for (int linha = 0; linha < notas.length; linha++) {
            for (int colunas = 0; colunas < notas.length; colunas++) {
                System.out.printf(" | "+notas[linha][colunas]+" | ");
            }
            System.out.println("");
        }
        
        
    }
}
