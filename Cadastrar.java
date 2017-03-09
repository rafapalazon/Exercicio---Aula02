import java.awt.event.ActionListener;
import java.util.Observer;


@Test
abstract class Cadastrar implements Observer
{
   private Janela cadastro;
   private Rotulo cpfR, nomeR, rgR, datNascR, empresaR, horTrabR, tipContaR;
   private CaixaDeTexto cpf, nome, rg, empresa, horTrab, tipConta;
   private CaixaDeSelecao datNasc;
   private Menu sobre, ajuda;
   private Botao cadastrar, cancelar, visualizar, sair;
   private Funcionario f;
   public Cadastrar(Funcionario f)
   {
      
      cadastro = new Janela();
      nomeR = new Rotulo("Nome");
      cpfR = new Rotulo("CPF");
      rgR = new Rotulo("RG");
      datNascR = new Rotulo ("Data Nasc.");
      empresaR = new Rotulo ("Empresa");
      horTrabR = new Rotulo ("Horário de Trabalho");
      tipContaR = new Rotulo ("Tipo de conta");
      nome = new CaixaDeTexto();
      cpf = new CaixaDeTexto();
      rg = new CaixaDeTexto();
      datNasc = new CaixaDeSelecao();
      empresa = new CaixaDeTexto();
      horTrab = new CaixaDeTexto();
      tipConta = new CaixaDeTexto();
      //JCheckBox datNasc = new JCheckBox("Itálico");
      cadastrar = new Botao("Cadastrar");
      cancelar = new Botao("Cancelar");
      cadastro.getContentPane().add(nomeR);
      cadastro.getContentPane().add(nome);
      cadastro.getContentPane().add(cpfR);
      cadastro.getContentPane().add(cpf);
      cadastro.getContentPane().add(rgR);
      cadastro.getContentPane().add(rg);
      cadastro.getContentPane().add(datNascR);
      cadastro.getContentPane().add(datNasc);
      cadastro.getContentPane().add(empresaR);
      cadastro.getContentPane().add(empresa);
      cadastro.getContentPane().add(horTrabR);
      cadastro.getContentPane().add(horTrab);
      cadastro.getContentPane().add(tipContaR);
      cadastro.getContentPane().add(tipConta);
      cadastro.getContentPane().add(cadastrar);
      cadastro.getContentPane().add(cancelar);  
      this.f = f;
      f.addObserver(this);
      cadastro.setVisible(true);    
   }
      
   public String getNome()
   {
      return nome.getText();
   }
   public void setNome(String nome)
   {
      this.nome.setText(nome);
   }
   public String getCpf()
   {
      return cpf.getText();
   }
   public void setCpf(String cpf)
   {
      this.cpf.setText(cpf);
   }

   public String getRg()
   {
      return rg.getText();
   }
   public void setRg(String rg)
   {
      this.rg.setText(rg);
   }
   public String getdatNasc()
   {
      return datNasc.getText();
   }
   public void setDatNasc(String datNasc)
   {
      this.datNasc.setText(datNasc);
   }
   public String getempresa()
   {
      return empresa.getText();
   }
   public void setEmpresa(String empresa)
   {
      this.empresa.setText(empresa);
   }

  
   public void addCadastrarListener(ActionListener a)
   {
      cadastrar.addActionListener(a);
   }
  
   public void addCancelarListener(ActionListener a)
   {
      cancelar.addActionListener(a);
   }
   public void addVisualizarListener(ActionListener a)
   {
      visualizar.addActionListener(a);
   }
   public void addSairListener(ActionListener a)
   {
      sair.addActionListener(a);
   }


   protected Funcionario getF()
   {
      return f;
   }
}
