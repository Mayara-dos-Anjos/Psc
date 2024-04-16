public class EmpregadoAssalariado extends Empregado {

    private double salario;

    // Construtor
    public EmpregadoAssalariado(double salario) {
        this.salario = salario;
    }

    // Implementação do método calculaSalario
    @Override
    public double calcularSalario() {
        return salario;
    }
}  
    

