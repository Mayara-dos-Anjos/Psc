package src.folha.heranca.Pessoa;
public class TesteConstrutoresPadrao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();

        pessoa.setNome("Ana");
        aluno.setNome("João");
    }
}
