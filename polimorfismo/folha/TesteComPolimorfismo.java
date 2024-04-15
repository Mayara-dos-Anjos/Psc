import java.util.Random;

public class TesteComPolimorfismo {
    public static void main(String[] args) {
        Random gerador = new Random();
        Empregado[] empregados = new Empregado[10];

        for (int i = 0; i < empregados.length; i++) {
            int tipo = gerador.nextInt(4)+1;
            switch (tipo) {
                case 1:{
                    double salario = gerador.nextDouble() * 1500+500;
                    
                }
            }
        }
    }
}
