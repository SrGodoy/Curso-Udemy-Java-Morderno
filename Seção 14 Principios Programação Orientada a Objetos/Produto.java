public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome ;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;

    }

    private String obterInfo() {
        return "O produto " + nome + " valor " + preco + " com " +quantidadeEmEstoque + " unidades no estoque ";
    }



    public static void main(String[] args) {
        Produto produto = new Produto("Placa mãe", 1200.00 , 4);
        System.out.println(produto.obterInfo());
    }
}