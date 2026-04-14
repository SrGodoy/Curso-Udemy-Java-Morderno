import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) {

        // ================= SET =================

        // criando um conjunto de numeros
        Set<Integer> numeros = new HashSet<>();

        // adicionando alguns numeros
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // vendo se tem o numero 20
        boolean tem20 = numeros.contains(20);
        System.out.println("tem o numero 20? " + tem20);

        // removendo o numero 10
        numeros.remove(10);

        // mostrando o que sobrou
        System.out.println("numeros no conjunto: " + numeros);


        // ================= MAP =================

        // criando um map tipo estoque (codigo, quantidade)
        Map<Integer, Integer> estoque = new HashMap<>();

        // colocando alguns produtos
        estoque.put(123, 50);
        estoque.put(456, 30);
        estoque.put(789, 20);

        // vendo quantos tem do produto 123
        int codigo = 123;
        int quantidade = estoque.get(codigo);

        System.out.println("quantidade do produto " + codigo + ": " + quantidade);

        // tentando remover 10 unidades
        int remover = 10;


        if (quantidade >= remover) {
            estoque.put(codigo, quantidade - remover);
            System.out.println("depois de remover ficou: " + (quantidade - remover));
        } else {
            System.out.println("nao tem quantidade suficiente");
        }
    }
}