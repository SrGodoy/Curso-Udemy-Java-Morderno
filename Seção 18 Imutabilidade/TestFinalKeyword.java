class ExemploFinal {

    //Definição de Constante - uso de final
    final int CODIGO_FIXO = 10;

    // Metodo final
    final void meuMetodo() {
        System.out.println("Este é um metodo final. ");
    }
}

public class TestFinalKeyword extends ExemploFinal{


    public static void main(String[] args) {

        ExemploFinal testFinal = new ExemploFinal();

        testFinal.meuMetodo();

    }
}