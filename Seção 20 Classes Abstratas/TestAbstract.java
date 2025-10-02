abstract class Carro {
    abstract void  acelerar();

    void frear() {
        System.out.println("O carro esta freiando...");
    }
}

class CarroF1 extends Carro {
    @java.lang.Override
    void acelerar() {
        System.out.println("O carro de Formula 1 está acelerando muito rapidamente...");
    }
}

class Caminhao extends Carro {
    @java.lang.Override
    void acelerar() {
        System.out.println("O caminhão esta acelarando lentamente...");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        CarroF1 carroF1 = new CarroF1();
        Caminhao caminhao = new Caminhao();

        carroF1.acelerar();
        carroF1.frear();

        caminhao.acelerar();
        caminhao.frear();
    }
}