public class Pessoa {
    public String  nome ;
    public int idade;
    protected String  endereco;
    int telefone;


    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}

class Aplicacao2 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "Luccas";
        p.idade = (27);
        p.endereco = "Rua do Bobos numero : 0";
        p.telefone = (33336666);

        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Endereço: " + p.getEndereco());
        System.out.println("Telefone: " + p.getTelefone());
    }
}