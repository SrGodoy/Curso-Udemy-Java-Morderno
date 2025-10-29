abstract class Operacao {
    public abstract double calcular(double a, double b);
}

class Soma extends Operacao{
    public double calcular(double a,double b){return a+b;}
}

class Subtracao extends Operacao{
    public double calcular(double a,double b){
        return a-b;
    }
}

class Multiplicacao extends Operacao{
    public double calcular(double a,double b){
        return a*b;}
}

class Divisao extends Operacao{
    public double calcular(double a,double b){
        if(b==0){
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a/b;
    }
}

public class CalculadoraPolimorfa{
    public static void main(String[]args){
        Operacao s=new Soma();
        Operacao sub=new Subtracao();Operacao m=new Multiplicacao();
        Operacao d=new Divisao();
        double a=10,b=5;
        System.out.println("Soma: "+s.calcular(a,b));
        System.out.println("Subtração: "+sub.calcular(a,b));
        System.out.println("Multiplicação: "+m.calcular(a,b));
        System.out.println("Divisão: "+d.calcular(a,b));
    }
}
