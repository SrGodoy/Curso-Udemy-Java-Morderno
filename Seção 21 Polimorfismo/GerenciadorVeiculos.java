// Classe abstrata Veiculo
abstract class Veiculo {
    private String placa;
    private int ano;


    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }


    public String getPlaca() {
        return placa;
    }


    public int getAno() {
        return ano;
    }

    public void exibirInformacoes() {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}

// Classe derivada Onibus
class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }




    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Assentos: " + assentos);
        System.out.println("------------------------");
    }
}

// Classe derivada Caminhao
class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Eixos: " + eixos);
        System.out.println("------------------------");
    }
}

// Classe GerenciadorVeiculos
public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("ABC-1234", 2018, 42);
        Caminhao caminhao = new Caminhao("XYZ-5678", 2020, 6);

        System.out.println("Informações do Ônibus:");
        onibus.exibirInformacoes();

        System.out.println("Informações do Caminhão:");
        caminhao.exibirInformacoes();
    }
}
