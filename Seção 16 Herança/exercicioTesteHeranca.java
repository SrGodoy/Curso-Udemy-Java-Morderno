class funcionario {
    private String nome;
    private double salario;

    //construtor
    public funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //getter e setters
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //adciona aumento no salario
    public void addAumento(double valor) {
        this.salario += valor;
    }

    //calcula salario anual (12 meses)
    public double ganhoAnual() {
        return salario * 12;
    }
}

class assistente extends funcionario {

    //contrutor
    public assistente(String nome, double salario){
        super(nome,salario);
    }

    //sobescreve ganhoAnual para incluir o bonus fixo de $1000

    @java.lang.Override
    public double ganhoAnual() {
        return super.ganhoAnual() + 1000;
    }
}

public class exercicioTesteHeranca {
    public static void main(String[] args) {
        assistente estagiario = new assistente("Luccas", 3000);

        //adciona aumento de R$ 500
        estagiario.addAumento(500);

        System.out.println("Nome: " + estagiario.getNome());
        System.out.println("Salario anual: R$ " + estagiario.ganhoAnual());
    }
}


