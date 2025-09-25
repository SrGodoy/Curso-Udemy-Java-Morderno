interface Veiculo {
    void iniciar();
    void parar();

    //metodo padrão (default)
    default void buzinar() {
        System.out.println("Buzinando");
    }
}

class Carro implements Veiculo {
    @java.lang.Override
    public void iniciar() {
        System.out.println("Carro iniciado");
    }

    @java.lang.Override
    public void parar() {
        System.out.println("Carro parado");
    }
}

class Caminhao implements Veiculo {
    public void iniciar() {
        System.out.println("Caminhao iniciado");
    }

    @java.lang.Override
    public void parar() {
        System.out.println("Caminhao parado");
    }
}

public class Exercicio01Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo caminhao = new Caminhao();

        carro.iniciar();
        carro.buzinar();
        carro.parar();

        System.out.println("-------------------------");

        caminhao.iniciar();
        caminhao.parar();
        caminhao.buzinar();

    }
}