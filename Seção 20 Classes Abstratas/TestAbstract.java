abstract class Carro {
    int codigo = 30;
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


        Caminhao caminhao = new Caminhao();

        System.out.println("Codigo " + caminhao.codigo);

        caminhao.codigo = 566;

        System.out.println("Codigo trocado " + caminhao.codigo);



    }
}