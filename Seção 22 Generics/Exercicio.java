class Peixe {
    private String nome;
    private double tamanho;

    public Peixe(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public double getTamanho() {
        return tamanho;
    }
}

class Polvo {
    private String nome;
    private int tentaculos;

    public Polvo(String nome, int tentaculos) {
        this.nome = nome;
        this.tentaculos = tentaculos;
    }

    public String getNome() {
        return nome;
    }

    public int getTentaculos() {
        return tentaculos;
    }
}

class Cesto<T> {
    private T conteudo;

    public void guardar(T item) {
        conteudo = item;
    }

    public T pegar() {
        return conteudo;
    }
}

public class Exercicio {
    public static void main(String[] args) {

        Cesto<Peixe> cestoPeixes = new Cesto<>();
        cestoPeixes.guardar(new Peixe("Dourado", 30.5));

        Peixe peixe = cestoPeixes.pegar();
        System.out.println("Peixe guardado: " + peixe.getNome() + ", Tamanho: " + peixe.getTamanho());

        Cesto<Polvo> cestoPolvos = new Cesto<>();
        cestoPolvos.guardar(new Polvo("Octopus", 8));

        Polvo polvo = cestoPolvos.pegar();
        System.out.println("Polvo guardado: " + polvo.getNome() + ", Tentáculos: " + polvo.getTentaculos());
    }
}