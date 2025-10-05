abstract class Carro {
    int codigo = 30;

    Carro(int cod) {
        codigo = cod;
    }

    abstract void  acelerar();

    void frear() {
        System.out.println("O carro esta freiando...");
    }
}



class Caminhao extends Carro {
    Caminhao (int codigo) {
        super(codigo);

    }

    @java.lang.Override
    void acelerar() {
        System.out.println("O caminhão esta acelarando lentamente...");
    }
}

public class TestAbstract {
    public static void main(String[] args) {


        Caminhao caminhao = new Caminhao(1000);

        System.out.println("Codigo " + caminhao.codigo);




    }
}