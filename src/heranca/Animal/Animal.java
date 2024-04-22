package heranca.animal;

public abstract class Animal {
    String nome;
    int qtdPatas;

    public Animal(){
        this.nome = "";
        this.qtdPatas = 0;
    }
    public Animal(String nome){
        this.nome = nome;
        this.qtdPatas = 0;
    }
    public Animal(String nome, int qtdPatas){
        this.nome = nome;
        this.qtdPatas = qtdPatas;
    }
}
