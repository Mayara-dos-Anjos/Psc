package polimorfismo.folha;

public class Empregado {
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;
    private double horasTrabalhadas;
    private double valorhora;
    
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getValorhora() {
        return valorhora;
    }
    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
    
}
