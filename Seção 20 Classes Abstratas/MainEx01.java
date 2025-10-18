abstract class FiguraGeometrica {

    //metodos abstratos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

}

class Retangulo extends FiguraGeometrica {

    private double base;
    private double altura;
//teste de commit para o novo windows e configuração do git do ambiente
    //construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }
    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // getters e setters opcionais
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}

public class MainEx01 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 6);


        System.out.println("Area do Retangulo: " + retangulo.calcularArea());
        System.out.println("Perimetro do Retangulo: "+ retangulo.calcularPerimetro());

    }
}