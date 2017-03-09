//Botao
import java.awt.Dimension;
import javax.swing.JButton;

@Before
public class Botao extends JButton
{
   public Botao(String rotulo)
   {
      super(rotulo);
      setPreferredSize(new Dimension(100,30));
   }
}
