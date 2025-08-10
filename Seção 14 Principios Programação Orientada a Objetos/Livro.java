public class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    int preco;


    public Livro() {
        titulo = "Desconhecido";
        autor = "Desconhecido";
        anoPublicacao = 0;
        preco = 0;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int anoPublicacao, int preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;

    }

    public String getAutor() {
        return autor;
    }
}

class Exibir {
    public static void mostrar(Livro livro) {
        System.out.println(
                "Livro: " + livro.titulo +
                        " | Autor: " + livro.getAutor() +
                        " | Ano: " + livro.anoPublicacao +
                        " | Preço: " + livro.preco
        );
    }
}

class Aplicacao{
    public static void main(String[] args) {
        Livro l1 = new Livro();
        Exibir.mostrar(l1);

        Livro l2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, 50);
        Exibir.mostrar(l2);

        Livro l3 = new Livro("Harry Potter", "Jk Rowling");
        Exibir.mostrar(l3);

    }
}
