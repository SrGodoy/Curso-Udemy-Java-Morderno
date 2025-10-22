abstract class Animal extends Object { //superclasse
    public abstract void fazerSom();
}

class Cachorro extends Animal { //Subclasse Cachorro
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

class Gato extends Animal { //Subclasse Gato
    public void fazerSom() {
        System.out.println("O gato faz: Miau Miau!");
    }
}

public class TestPolimorfismo {
    public static void main(String[] args) {

        //Criando objetos polimórficos

        Object meuCachorro = new Cachorro();
        Object meuGato = new Gato();

       // meuCachorro.fazerSom(); // Imprime : O cachorro faz: Au Au!
        Cachorro objCovertido = (Cachorro) meuCachorro; //Casting Object
        objCovertido.fazerSom();

        ((Cachorro) meuCachorro).fazerSom();
    }
}