package front;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwing {
    public static void criarTela(){
        JFrame tela = new JFrame("Hello, Swing!!!");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //constroi um Jlabel
        JLabel helloSwinglabel = new JLabel ("Hello, Swing!!!!!!!!!");
        //obtem o painel de conteudo
        Container painelDeConteudo = tela.getContentPane();
        //add o Jlabel ao painel  de conteudo
        painelDeConteudo.add(helloSwinglabel);
        // ajusta largura e altura conforme conteudo
        tela.pack();
        //torna a tela visivel
        tela.setVisible(true);
    }
        public static void main(String[] args){
            SwingUtilities.invokeLater(()->{
                criarTela();
            });
    }
    
}
