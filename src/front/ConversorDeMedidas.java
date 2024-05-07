package front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorDeMedidas extends JFrame implements ActionListener{

    private JTextField inputField;
    private JButton btnMetros, btnMilimetros, btnQuilometros;
    private JLabel resultadoLabel;

    public ConversorDeMedidas() {
        setTitle("Conversor de Medidas");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        inputField = new JTextField();
        add(inputField);

        btnMetros = new JButton("Metros");
        btnMetros.addActionListener(this);
        add(btnMetros);

        btnMilimetros = new JButton("Milimetros");
        btnMilimetros.addActionListener(this);
        add(btnMilimetros);

        btnQuilometros = new JButton("Quilometros");
        btnQuilometros.addActionListener(this);
        add(btnQuilometros);

        resultadoLabel = new JLabel("Resultado:");
        add(resultadoLabel);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnMetros) {
            converterParaMetros();
        } else if (e.getSource() == btnMilimetros) {
            converterParaMilimetros();
        } else if (e.getSource() == btnQuilometros) {
            converterParaQuilometros();
        }
    }
   
    private void converterParaMetros() {
        try {
            double centimetros = Double.parseDouble(inputField.getText());
            double metros = centimetros / 100;
            resultadoLabel.setText("Resultado: " + metros + " metros");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void converterParaMilimetros() {
        try {
            double centimetros = Double.parseDouble(inputField.getText());
            double milimetros = centimetros * 10;
            resultadoLabel.setText("Resultado: " + milimetros + " milímetros");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void converterParaQuilometros() {
        try {
            double centimetros = Double.parseDouble(inputField.getText());
            double quilometros = centimetros / 100000;
            resultadoLabel.setText("Resultado: " + quilometros + " quilômetros");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ConversorDeMedidas();
            }
        });
    }
}
