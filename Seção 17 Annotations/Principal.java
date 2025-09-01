class MinhaClasse {

    //metodo soma dois inteiros
    public int calcularSoma(int a, int b) {
        return a + b;
    }

    // metodo para calcular o produto de dois inteiros , marcado como obsoleto
    @Deprecated
    public int calcularProduto(int a, int b){
        return  a * b;
    }
}

public class Principal {
    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();

        int soma = obj.calcularSoma(5,3);
        int produto = obj.calcularProduto(5,3);

        System.out.println("Soma: "+ soma);
        System.out.println("Produto (deprecated): " + produto);
    }
}