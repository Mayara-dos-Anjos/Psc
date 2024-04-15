package Animal;

public class Teste {
    public static void main(String[] args) {
        Cachorro Dog = new Cachorro("Marley");
        Gato Cat = new Gato("Bob");

        System.out.println("");
        System.out.println("Nome do cachorro: "+Dog.nome);
        System.out.println("Quantidade de patas: "+Dog.qtdPatas);
        System.out.println("Nome do gato: "+Cat.nome);
        System.out.println("Quantidade de patas: "+Cat.qtdPatas);
        System.out.println("");

        Ave Arara = new Ave("Floresta tropical", true);
        Arara.nome = "Blue";
        Reptil Tartaruga = new Reptil("Mar");
        Tartaruga.nome = "Michelangelo";
        Ornitorrinco Ornitorrinco = new Ornitorrinco("Perry");

        System.out.println("Arara");
        System.out.println("Nome: "+Arara.nome);
        System.out.println("Tem asa? "+Arara.temAsa);
        System.out.println("Voa? "+Arara.voa);
        System.out.println("Qual seu habitat? "+Arara.habitat);
        System.out.println("");
        System.out.println("Tartaruga");
        System.out.println("Nome: "+Tartaruga.nome);
        System.out.println("Tem asa? "+Tartaruga.temAsa);
        System.out.println("Qual seu habitat? "+Tartaruga.habitat);
        System.out.println("");
        System.out.println("Ornitorrinco");
        System.out.println("Nome do ornitorrinco: "+Ornitorrinco.nome);
        

    }
}
