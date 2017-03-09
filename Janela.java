//Janela

import java.awt.FlowLayout;
import javax.swing.JFrame;
public class Janela extends JFrame{
   public Janela(){
      setTitle("Cadastrar Funcionário");
      setBounds(100,100,525,370);
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
   }
}