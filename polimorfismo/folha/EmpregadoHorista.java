public class EmpregadoHorista extends Empregado {
   
    private double valorHora;
    private int numeroHoras;

    // Construtor
    public EmpregadoHorista(double valorHora, int numeroHoras) {
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    // Implementação do método calculaSalario
    @Override
    public double calcularSalario() {
        return valorHora * numeroHoras;
    }
}
