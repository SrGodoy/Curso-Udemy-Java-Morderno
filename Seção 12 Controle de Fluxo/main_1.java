public class main_1 {
    public static void main (String [] args) {
        //if-else
        int a = 10;
        if (a > 5) {
            System.out.println("a é maior que 5");
        } else {
            System.out.println("a é menor ou igual a 5");
        }
        // Operador Ternário
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número é: " + resultado);

        //Intanceof
        Object obj = "Hello";
        if (obj instanceof String) {
            System.out.println(obj); // Saída: Hello
        }
    //switch-case expression
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Segunda");
            case 2 -> System.out.println("Terca");
            case 3 -> System.out.println("Quarta");
    // ...
            default -> System.out.println("Desconhecido");
        }
        //switch-case initialization
        String dia = "Ter.";
        String tipoDeDia = switch (dia) {
            case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia util";
            case "Sabado", "Domingo" -> "Fim de semana";
            default -> "Desconhecido";
        };
        System.out.println(tipoDeDia); // Dia util
         //switch case lagacy
        int diaDaSemana = 3; // 1 representa segunda, 2 terça, etc.
        switch (diaDaSemana) {
            case 1:
                System.out.println("Seg.");
                break;
            case 2:
                System.out.println("Ter.");
                break;
            case 3:
                System.out.println("Qua.");
                break;
            case 4:
                System.out.println("Qui.");
                break;
            case 5:
                System.out.println("Sex.");
                break;
            default:
                System.out.println("Dia desconhecido");
                break;
        }

        //switch-case default






    }
}


