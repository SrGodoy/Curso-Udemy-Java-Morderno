import java.util.Arrays; //Importação explícita de classe Arrays
import java.util.List;
import java.util.ArrayList;
//import java.util.*; // Importa todas as classes do pacote java.util

public class ExemploList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        //Verificando se a lista contém um elemento
        System.out.println("Contem 'Java'? " + lista.contains("Java")); //true

        //Adcionando todos os elementos de outra coleção
        List<String> outraLista = Arrays.asList("JavaScript", "Ruby");
        lista.addAll(outraLista);

        //imprimir --> [Java, Python, C++, JavaScript, Ruby]
        System.out.println("Lista completa: " + lista);

        //Removendo um elemento
        lista.remove("Python");

        //imprimir --> [Java, C++, JavaScript, Ruby]
        System.out.println("Lista após remoção: " + lista);

        //Obtendo um elemento pelo indice
        String elemento = lista.get(2); // obtem o 3 elemento da lista
        System.out.println("Elemento no indice 2: " + elemento);

        //Limpando a lista
        lista.clear();

        System.out.println("Lista apos limpar: " + lista); // []
    }
}
