public class FinalVariables {

    private static final int numeroMaximo = 100;
    private static final String mensagi = "Bem vindo ao mundo da programação";

    public static void main(String[] args) {

        // numeroMaximo = 200; erro tentativa
        // mensagi = "Outra mensagem"; erro tentativa
        imprimirValoresFinais();

    }
    public static void imprimirValoresFinais() {
        System.out.println("Numero maximo: " + numeroMaximo);
        System.out.println("Mensagem: " + mensagi);
    }
}