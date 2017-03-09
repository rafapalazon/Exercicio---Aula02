// Login e Senha
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
   // Bot�o
   JButton b;
   JButton cancelar;
   // R�tulos
   JLabel lb; //login
   JLabel lbs; //Senha
   // Campo Texto
   JTextField tf; //login
   JTextField tfs; //senha
  
   // M�todo Construtor
   public Login()
   {
      // Cria um Conteiner de Tela
      Container c = getContentPane();
      // Determina a tela como um FlowLayout
      c.setLayout(new FlowLayout());
      // Cria um R�tulo com o texto "Login"
      lb = new JLabel("Login");
      // Adiciona o R�tulo no Conteiner "login"
      c.add(lb);
      // Cria um Campo Texto de largura 10 pxls para "login"
      tf = new JTextField(10);
      // Adiciona o Campo Texto no Conteiner para "login"
      c.add(tf);
      
      lbs = new JLabel("Senha");
      // Adiciona o R�tulo no Conteiner "senha"
      c.add(lbs);
      // Cria um Campo Texto de largura 10 pxls para "senha"
      tf = new JTextField(10);
      // Adiciona o Campo Texto no Conteiner para "senha"
      c.add(tf);
      
      // Cria um Bot�o com o texto "Logar"
      b = new JButton("Logar");
      cancelar = new JButton ("Cancelar");
      // Adiona o Bot�o no Conteiner
      c.add(b);
      c.add(cancelar);
      // Adiciona uma a��o ao Bot�o
      b.addActionListener(this);
      // Programa o tamanho inicial do FlowLayout em pxls
      setSize(200,125);
      // Determina a localiza��o inicial do FlowLayout em pxls
      setLocation(470,50);
      // Determina qual o t�tulo do FlowLayout
      setTitle("Acesso");
      // Estabelece que o FlowLayout ser� vis�vel inicialmente
      setVisible(true);
   }

   // M�todo de tratamento do evento da a��o do bot�o
   public void actionPerformed(ActionEvent e)
   {
      // Verifica se o evento pertence ao bot�o
      if(e.getSource() == b)
      {
         // Apresenta o atributo valor (de Dialogo)
         JOptionPane.showMessageDialog(null,
                  "Valor Digitado:"+DialogoM.getValor(this));
      }
   }
}   