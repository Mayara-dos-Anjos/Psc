public class EmpregadoAssalariadoComissionado extends Empregado {

    private double salario;
    private double comissao;

    // Construtor
    public EmpregadoAssalariadoComissionado(double salario, double comissao) {
        this.salario = salario;
        this.comissao = comissao;
    }

    // Implementação do método calculaSalario
    @Override
    public double calcularSalario() {
        return salario + (salario * comissao);
    }
}
    

