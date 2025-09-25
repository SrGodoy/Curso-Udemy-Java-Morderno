interface Produto {
   String getNome();
   int getQuantidade();

   void adicionarQuantidade(int quantidade);
   void removerQuantidade(int quantidade);
}

    class ProdutoImpl implements Produto{
        private String nome;
        private int quantidade;

        //Construtor
        public ProdutoImpl(String nome, int quantidade) {
            this.nome = nome;
            this.quantidade = quantidade;
        }

        @java.lang.Override
        public String getNome() {
            return nome;
        }

        @java.lang.Override
        public int getQuantidade() {
            return quantidade;
        }

        @java.lang.Override
        public void adicionarQuantidade(int quantidade) {
            if (quantidade > 0) {
                this.quantidade += quantidade;
                System.out.println(quantidade + " unidade adcionadas ao estoque de " + nome);
            }else {
                System.out.println("Quantidade invalida para adcionar");
            }
        }

        @java.lang.Override
        public void removerQuantidade(int quantidade) {
            if (quantidade <= 0) {
                System.out.println("Quantidade inválida para remover.");
            } else if (quantidade > this.quantidade) {
                System.out.println("Estoque insuficiente para remover " + quantidade + " unidades de " + nome);
            } else {
                this.quantidade -= quantidade;
                System.out.println(quantidade + " unidades removidas do estoque de " + nome );
            }
        }
    }

    public class Exercicio03Main {
        public static void main(String[] args) {
            Produto produto1 = new ProdutoImpl("Playstation 5", 103);

            System.out.println("Produto: " + produto1.getNome() + " | Quantidade em estoque: " + produto1.getQuantidade());

            produto1.adicionarQuantidade(20);
            System.out.println("Estoque atual: " + produto1.getQuantidade());

            produto1.removerQuantidade(30);
            System.out.println("Estoque atual: " + produto1.getQuantidade());

            produto1.removerQuantidade(80);
            System.out.println("Estoque atual: " + produto1.getQuantidade());
        }
    }

