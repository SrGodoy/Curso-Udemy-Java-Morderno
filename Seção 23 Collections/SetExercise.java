import java.util.Set;
import java.util.HashSet;

public class SetExercise {
    public static void main(String[] args) {

        // criando o conjunto de inteiros
        Set<Integer> numeros = new HashSet<>();

        // adicionando números
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        // verificando se contém um número
        int numeroProcurado = 20;
        if (numeros.contains(numeroProcurado)) {
            System.out.println(numeroProcurado + " está no conjunto.");
        } else {
            System.out.println(numeroProcurado + " NÃO está no conjunto.");
        }
        // removendo um número
        numeros.remove(30);



        // imprimindo os números restantes
        System.out.println("Números restantes no conjunto:");
        for (Integer n : numeros) {
            System.out.println(n);
        }
    }
}