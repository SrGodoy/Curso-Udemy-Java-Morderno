public class Exercicios {
    public static void main (String [] args){

        //Exercicio Calculadora Simples
        int calculadoraA = 10;
        int calculadoraB = 2;
        int calculosoma = calculadoraA + calculadoraB;
        int calculosubtracao = calculadoraA - calculadoraB;
        int calculomulti = calculadoraA * calculadoraB;
        float calculodivi = calculadoraA / calculadoraB;
        int calculoresto = calculadoraA % calculadoraB;

        System.out.println("## ------------------------------ ## ");
        System.out.println("## Exercicio Calculadora Simples ## ");
        System.out.println(" Numeros A = " + calculadoraA + " e Numero B = " + calculadoraB);
        System.out.println(" Soma " + calculosoma);
        System.out.println(" Subtração " + calculosubtracao);
        System.out.println(" Multiplicação " + calculomulti);
        System.out.println(" Divisão " + calculodivi);
        System.out.println(" Resto " + calculoresto);


        //Exercicio Operadores Atribuição
        int numero = 5 ;
        int adicao = numero+3;
        int subtri = numero-2;
        int multi = numero*4;
        float divi = numero/2;

        System.out.println("## ------------------------------ ## ");
        System.out.println("## Exercicio Operadores Atribuição ## ");
        System.out.println(" Numero = "+ numero);
        System.out.println(" Adição " + adicao);
        System.out.println(" Subtração " + subtri);
        System.out.println(" Multiplicação " + multi);
        System.out.println(" Divisão " + divi);
        System.out.println("## ------------------------------ ## ");

        //Exercicio Contador
        System.out.println("## Exercicio Contador ## ");
        int contador = 5;
        System.out.println(" Contador inicial  " + contador);
        contador++;
        System.out.println(" Contador apos incremento  " + contador);
        contador--;
        System.out.println(" Contador apos decremento  " + contador);
        System.out.println("## ------------------------------ ## ");

        //Exercicio Precendencia Operadores de Atribuição
        int numeroprec = 5;
        System.out.println("## Exercicio Precendencia Operadores de Atribuição ## ");

        System.out.println(" Numero precedencia inicial  " + numeroprec);
        ++numeroprec;
        System.out.println(" Numero precedencia pré-incremento  " + numeroprec);
        numeroprec++;
        System.out.println(" Numero precedencia pós-incremento  " + numeroprec);
        --numeroprec;
        System.out.println(" Numero precedencia pré-decremento  " + numeroprec);
        numeroprec--;
        System.out.println(" Numero precedencia pós-decremento  " + numeroprec);
        System.out.println("## ------------------------------ ## ");


    }
}