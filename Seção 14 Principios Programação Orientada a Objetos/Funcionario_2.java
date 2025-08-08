public class Funcionario {
    String nome;
    String cargo;
    int idade;

    // Este é o construtor
    Funcionario(String nomeInit, String cargoInit, int idadeInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }
    Funcionario(int idadeInit, String cargoInit, String nomeInit ) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }
    Funcionario(String nomeInit) {
        nome = nomeInit;
    }

    Funcionario() {
    }


    public static void main(String[] args) {

        // Funcionario funcionario = new Funcionario("João", "Desenvolvedor" , 30);
        // Funcionario funcionario1 = new Funcionario();
        // funcionario1.nome = "João";
        Funcionario funcionario = new Funcionario(50,"Gerente","Maria");


        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Idade: " + funcionario.idade);


    }

}