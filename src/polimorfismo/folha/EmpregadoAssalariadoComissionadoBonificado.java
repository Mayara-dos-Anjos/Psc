public class EmpregadoAssalariadoComissionadoBonificado extends Empregado {

        private double salario;
        private double comissao;
        private double bonus;
    
        // Construtor
        public EmpregadoAssalariadoComissionadoBonificado(double salario, double comissao, double bonus) {
            this.salario = salario;
            this.comissao = comissao;
            this.bonus = bonus;
        }
    
        // Implementação do método calculaSalario
        @Override
        public double calcularSalario() {
            return salario + (salario * comissao) + bonus;
        }
    }
    
    

