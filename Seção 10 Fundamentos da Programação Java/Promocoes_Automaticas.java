 public class Promocoes_Automaticas {
    public static void main(String[] args){
        byte a = 10;
        int b = a + 5 ;
        System.out.println("valor de a = " + a);

        int d = 10;
        float e = 1.5f;
        float f = d * e; // a é promovido para float antes do calculo

        System.out.println("valor de f = " + f);

        int g = 10;
        double h = 1.5;
        double i = g * h; // a é promovido para double antes do cálculo

        System.out.println("valor de i = " + i);

    }

 }