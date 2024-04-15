import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        LivroDeNotas livro = new LivroDeNotas("Programação",10);

        livro.gerarNotas();

        livro.calcularMedias();

        livro.mostrarMedias();

        livro.exibeMaior();

        livro.mediaDaTurma();

        JOptionPane.showMessageDialog(null, "Variancia: "+livro.variancia());

        JOptionPane.showMessageDialog(null, "Desvio Padrão: "+livro.desvioPadrao());

        

       
    }
}
