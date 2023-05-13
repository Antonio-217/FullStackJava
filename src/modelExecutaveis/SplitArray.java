package modelExecutaveis;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

    public static void main(String[] args) {

        String texto = " Antonio, Java, BackEnd, 18";

        //a função do split é quebrar o texto da string,
        //ele separa a string de acordo com sua necessidade
        
        String[] valoresArray = texto.split(",");
        
        System.out.println("Usando o split para separar a string!");
        for (int i = 0; i < valoresArray.length; i++) {
            System.out.println("Texto:"+valoresArray[i]);
        }
        
        System.out.println("\nNome:"+valoresArray[0]);
        System.out.println("Linguagem:"+valoresArray[1]);
        System.out.println("Expecialização:"+valoresArray[2]);
        System.out.println("Idade:"+valoresArray[3]);
        
        
        //convertendo uma array em uma lista
       
        List<String> listaTexto = Arrays.asList(valoresArray);
        
        System.out.println("\nUsando a conversão de array para lista!");
        for (String valorString : listaTexto) {         
            System.out.println("Texto:"+valorString);
        }
 
        
        //convertendo uma lista em array
        
        String[] conversaoArray = listaTexto.toArray(new String[4]);
        
        System.out.println("\nUsando a conversão de lista para array!");
        for (int i = 0; i < conversaoArray.length; i++) {
            System.out.println("Texto:"+conversaoArray[i]);
        }
            
        }   
    }
