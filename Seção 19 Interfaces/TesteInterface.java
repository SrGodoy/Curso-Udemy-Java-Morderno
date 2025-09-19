interface SerVivo {
    void respirar(); //método abstrato
}



interface Animal extends SerVivo {
    String DESCRICAO = "Animal é um ser vivo importante!";
    void fazerSom(); //método abstrato
}


class Cachorro implements Animal {
   public void respirar() {}

    @java.lang.Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}


 class Gato implements Animal {
    public void respirar() {}

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