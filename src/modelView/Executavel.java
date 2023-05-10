package modelView;

import execao.ExecaoProcessar;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelDominio.Medico;
import modelDominio.Usuario;
import modelFunction.FuncaoAutenticacao;
import modelFunction.GeradorToken;

public class Executavel {

    public static void main(String[] args) throws ExecaoProcessar {

        try {
            lerArquivo();
            
            String login = JOptionPane.showInputDialog("Informe o login: ");
            String senha = JOptionPane.showInputDialog("Informe a senha: ");

            FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
            PermitirAcesso permitirAcesso = new Medico(login, senha);
            //criando a lista
            LinkedList<Usuario> listaUsuarios = new LinkedList<>();

            if (autenticacao.autenticarUsuario(permitirAcesso)) {
                /*Vou travar o contrato para autorizar somente quem tem 100% legitimo*/
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
                // criando o objeto da classe
                Medico meuMedico = new Medico(login, senha);

                JOptionPane.showMessageDialog(null, "Seu token: " + GeradorToken.gerador());
                // adicionando o objeto na lista
                listaUsuarios.add(meuMedico);

            } else {
                JOptionPane.showMessageDialog(null, "Login não efetuado");
            }

        } catch (NullPointerException e) {
            e.printStackTrace();/*imprime erro no console*/

 /*mensagem do erro ou causa*/
            System.out.println("Mensagem: " + e.getMessage());

            for (int i = 0; i <= e.getStackTrace().length; i++) {

                System.out.println("Classe de erro: " + e.getStackTrace()[i].getClassName());
                System.out.println("Método de erro: " + e.getStackTrace()[i].getMethodName());
                System.out.println("Linha de erro: " + e.getStackTrace()[i].getLineNumber());
                System.out.println("Exceção: " + e.getClass().getName());
            }

            JOptionPane.showMessageDialog(null, "Erro ao processar usuario");
        } catch(FileNotFoundException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na excecao customizada: "+e.getClass().getName());
            
        }  finally{ //sempre é executado ocorrendo erros ou não, porque finally sempre é usado quando
                   //precisa executar um processo acontecendo erros ou não
            JOptionPane.showMessageDialog(null,"Obrigado por usar nosso sistema");
        }

    }

    public static void lerArquivo() throws FileNotFoundException {

        File fil = new File("c://texto.txt");
        Scanner scanner = new Scanner(fil);

    }

}
