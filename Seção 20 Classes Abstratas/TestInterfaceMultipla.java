interface Interface1 {
    void metodo1();
}

interface Interface2 {
    void metodo2();
}


class ClassExemplo implements Interface1, Interface2 {
    @java.lang.Override
    public void metodo1() {
        System.out.println("Método 1");
    }

    @java.lang.Override
    public void metodo2() {
        System.out.println("Método 2");
    }


}

public class TestInterfaceMultipla{
    public static void main(String[] args) {
        ClassExemplo exemplo = new ClassExemplo();
        exemplo.metodo1();
        exemplo.metodo2();

    }
}