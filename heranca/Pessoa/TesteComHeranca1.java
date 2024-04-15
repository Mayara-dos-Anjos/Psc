package Pessoa;
public class TesteComHeranca1 {
    public static void main(String[] args) {
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.setNome("Maria"); 
        aluno.setIdade(10);

        System.out.printf("nome: %s, idade: %d", aluno.getNome(), aluno.getIdade());

    }
}
