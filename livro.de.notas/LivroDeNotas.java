import java.util.Random;

import javax.swing.JOptionPane;

public class LivroDeNotas {
    private String nomeDisciplina;
    private double[] notas1;
    private double[] notas2;
    private double[] medias;
    private int qtdAlunos;

    public LivroDeNotas(String nomeDisciplina, int qtdAlunos){
        this.nomeDisciplina = nomeDisciplina;
        this.notas1 = new double[qtdAlunos];
        this.notas2 = new double[qtdAlunos];
        this.medias = new double[qtdAlunos];
        this.qtdAlunos = qtdAlunos;
    }
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    public void gerarNotas(){
        Random gerador = new Random();
        for(int i = 0; i < qtdAlunos; i++){
            notas1[i] = gerador.nextDouble()*10;
            notas2[i] = gerador.nextDouble()*10;
        }
    }
    public void calcularMedias(){
        for(int i = 0; i <this.notas1.length; i++){
            double media = (this.notas1[i]+this.notas2[i])/2;
            this.medias[i] = media;
        }
    }public void mostrarMedias(){
        String todasAsMedias = "";
        for(int i=0; i<qtdAlunos; i++){
            todasAsMedias+=String.format("Aluno %d: %.2f\n", i+1,medias[i]);
        }JOptionPane.showMessageDialog(null, todasAsMedias);
    }
    public void exibeMaior(){
        double maior = this.medias[0];
        for(int i=0; i<qtdAlunos; i++){
            if(this.medias[i] > maior){
                maior = this.medias[i];
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Maior média: %.2f", maior));
    }
    public void mediaDaTurma(){
        double mediaDaTurma = 0;
        for(int i=0; i<this.qtdAlunos; i++){
            mediaDaTurma += this.medias[i];
        }
        JOptionPane.showMessageDialog(null,"Média da turma:"+(mediaDaTurma/this.qtdAlunos));
    }
    public double variancia(){
        double mediaDaTurma = 0;
        for(int i=0; i<this.qtdAlunos; i++){
            mediaDaTurma +=this.medias[i];
        }
        mediaDaTurma = mediaDaTurma/this.qtdAlunos;
        double soma = 0;
        for(int i=0; i<this.qtdAlunos; i++){
            soma += Math.pow(this.medias[i]-mediaDaTurma,2);
        }
        return soma/(this.qtdAlunos-1);
    }
    
    public double desvioPadrao(){
        return Math.sqrt(this.variancia());
    }
   



}
