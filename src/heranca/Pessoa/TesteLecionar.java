package heranca.Pessoa;
public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista profHorista = new ProfessorHorista();
        profHorista.setNome("Gilberto");

        ProfessorPesquisador profPesq = new ProfessorPesquisador();
        profPesq.setNome("Lindomar");

        profHorista.lecionar();
        profPesq.lecionar();
    }
}
