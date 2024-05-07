package front;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ConversorTemp {
    public static void criarTela(){
        JFrame tela = new JFrame("Conversor de Temperatura");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusJLabel = new JLabel("\u00B0C");
        JButton converButton = new JButton("Converter");
        JLabel valorConvertidoLabel = new JLabel("");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2,4,2,4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusJLabel);
        painelDeConteudo.add(converButton);
        painelDeConteudo.add(valorConvertidoLabel);
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

        converButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                double celsius = Double.parseDouble(celsiusTextField.getText());
                double fahrenheit = (celsius * 1.8) + 32;
                valorConvertidoLabel.setText(fahrenheit + " \u00B0F");
            }
        });
    }
    public void main(String[] args) {
        SwingUtilities.invokeLater(()->{
        criarTela();    
        });
        
    }
}
