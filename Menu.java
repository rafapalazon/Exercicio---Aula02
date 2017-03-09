//Menu
import javax.swing.*;
public class Menu {
    public static void main( String[] args ) {
	     
	JFrame janela = new JFrame( "Login" );
	janela.setDefaultCloseOperation( janela.EXIT_ON_CLOSE );
	janela.setSize( 300, 300 );
      
   Rotulo loginR, senhaR;
   CaixaDeTexto nome;
   CaixaDeSelecao datNasc;
   Menu sobre, ajuda;
   Botao cadastrar, cancelar, visualizar;
   Funcionario f;
   loginR = new Rotulo("Login");
   senhaR = new Rotulo("Senha");
   
   
   CaixaDeTexto.getContentPane().add(loginR);
   cadastro.getContentPane().add(senhaR);

   
	JMenuBar barra = new JMenuBar();
	JMenu arquivo = new JMenu( "Arquivo" );
	JMenu sair = new JMenu( "Sair" );
   nome = new CaixaDeTexto();

   janela.setJMenuBar( barra );
	barra.add( arquivo );
   barra.add( sair );
   
	janela.setVisible( true );
   

   
}
}