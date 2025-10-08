interface Interface1 {
    void metodo1();
}

interface Interface2 {
    void metodo2();
}


abstract class ClassExemplo implements Interface1, Interface2 {
    @java.lang.Override
    public void metodo1() {
        System.out.println("Método 1");
    }

    @java.lang.Override
    public void metodo2() {
        System.out.println("Método 2");
    }


}

public class TestInterfaceMultipla extends ClassExemplo{
    public static void main(String[] args) {
        TestInterfaceMultipla test = new TestInterfaceMultipla();
        test.metodo1();
        test.metodo2();

    }
}