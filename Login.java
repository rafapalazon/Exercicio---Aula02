// Login e Senha
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
   // Botão
   JButton b;
   JButton cancelar;
   // Rótulos
   JLabel lb; //login
   JLabel lbs; //Senha
   // Campo Texto
   JTextField tf; //login
   JTextField tfs; //senha
  
   // Método Construtor
   public Login()
   {
      // Cria um Conteiner de Tela
      Container c = getContentPane();
      // Determina a tela como um FlowLayout
      c.setLayout(new FlowLayout());
      // Cria um Rótulo com o texto "Login"
      lb = new JLabel("Login");
      // Adiciona o Rótulo no Conteiner "login"
      c.add(lb);
      // Cria um Campo Texto de largura 10 pxls para "login"
      tf = new JTextField(10);
      // Adiciona o Campo Texto no Conteiner para "login"
      c.add(tf);
      
      lbs = new JLabel("Senha");
      // Adiciona o Rótulo no Conteiner "senha"
      c.add(lbs);
      // Cria um Campo Texto de largura 10 pxls para "senha"
      tf = new JTextField(10);
      // Adiciona o Campo Texto no Conteiner para "senha"
      c.add(tf);
      
      // Cria um Botão com o texto "Logar"
      b = new JButton("Logar");
      cancelar = new JButton ("Cancelar");
      // Adiona o Botão no Conteiner
      c.add(b);
      c.add(cancelar);
      // Adiciona uma ação ao Botão
      b.addActionListener(this);
      // Programa o tamanho inicial do FlowLayout em pxls
      setSize(200,125);
      // Determina a localização inicial do FlowLayout em pxls
      setLocation(470,50);
      // Determina qual o título do FlowLayout
      setTitle("Acesso");
      // Estabelece que o FlowLayout será visível inicialmente
      setVisible(true);
   }

   // Método de tratamento do evento da ação do botão
   public void actionPerformed(ActionEvent e)
   {
      // Verifica se o evento pertence ao botão
      if(e.getSource() == b)
      {
         // Apresenta o atributo valor (de Dialogo)
         JOptionPane.showMessageDialog(null,
                  "Valor Digitado:"+DialogoM.getValor(this));
      }
   }
}   