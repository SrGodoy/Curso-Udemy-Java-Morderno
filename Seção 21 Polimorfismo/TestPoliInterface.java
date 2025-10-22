interface Veiculo { //interface
        void acelerar();
}

//Subclasse carro
class Carro implements Veiculo {
    @java.lang.Override
    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }
}

//Subclasse Moto
class Moto implements Veiculo {
    @java.lang.Override
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }
}

//Classe Principal
public class TestPoliInterface {
    public static void main(String[] args) {
        //Criando Objetos polimorficos
        Veiculo meuCarro = new Carro();
        Veiculo minhaMoto = new Moto();

        meuCarro.acelerar(); //Imprime ; o carro esta acelerando
        minhaMoto.acelerar(); //Imprime : a moto esta acelerando
    }
}