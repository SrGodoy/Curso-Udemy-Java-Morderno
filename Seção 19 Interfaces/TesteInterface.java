interface Animal {
    public static final String DESCRICAO = "Animal é um ser vivo importante!";
    void fazerSom(); //método abstrato
}

//Classe Cachorro que implementa a interface animal
class Cachorro implements Animal {

    @java.lang.Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

// Classe Gato que implementa a interface animal
 class Gato implements Animal {

    @java.lang.Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau Miau!");
    }
}

public class TesteInterface{
    public static void main(String[] args) {


        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom(); // deve imprimir au au

        Gato gato = new Gato();
        gato.fazerSom(); // deve imprimir miau maiu

        System.out.println("Descrição da interface: " + Animal.DESCRICAO);
    }
}