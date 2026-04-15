public class ExceptionDivisaoPorZero {
    public static void main(String[] args) {
        int totalNotas = 0;
        int quantidadedeAlunos = 0;

        try {
            int media = totalNotas / quantidadedeAlunos ; //Divisão por zero
        } catch (ArithmeticException e) {
            System.out.println("Problema: Divisão por zero!");
        }finally {
            System.out.println("O programa terminou.");
        }

    }

}