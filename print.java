package bofao;

import javax.swing.JOptionPane;


public class Bofao {

    
    public static void main(String[] args) {
     String nome = JOptionPane.showInputDialog("digite seu nome");
     JOptionPane.showMessageDialog(null, "bem vindo, " +nome);
     String idade = JOptionPane.showInputDialog("digite sua idade");
     String msg = "que legal "+nome+", você tem "+idade+" anos";
     JOptionPane.showMessageDialog(null, msg);
     String rl = JOptionPane.showInputDialog("qual o contrario de papelada");
             if(rl.equals("pavestida")){
                 JOptionPane.showMessageDialog(null, "acertou!!");
             }
             else{
                 JOptionPane.showMessageDialog(null, "errou");
         
             }
             rl=JOptionPane.showInputDialog(null, "quantos anos o jackson tem?");
             if(rl.equals("35")){
                 JOptionPane.showMessageDialog(null, "Desgraça!!");
             }
              else{
                 JOptionPane.showMessageDialog(null, "errou");
             }
    }
    

}
