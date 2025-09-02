class ExemploFinal {

    //Definição de Constante - uso de final
    final int CODIGO_FIXO = 10;

    // Metodo final
    final void meuMetodo() {
        System.out.println("Este é um metodo final. ");
    }
}

public class TestFinalKeyword {
    public static void main(String[] args) {
        ExemploFinal testFinal = new ExemploFinal();

        final int testFInalVariableLocal = 777;
        testFInalVariableLocal = 333;
        System.out.println("Valor da variavel local: " + testFInalVariableLocal);

        //testFinal.CODIGO_FIXO = 666; // -> Erro de compilação

        System.out.println("Valor da constante: " + testFinal.CODIGO_FIXO);
        testFinal.meuMetodo();
    }
}