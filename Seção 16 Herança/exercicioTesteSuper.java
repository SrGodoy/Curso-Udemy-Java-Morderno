class Pessoa {
    private String nome;
    private int idade;

    public Pessoa (String nome, int idade) {
        this.nome = nome ;
        this.idade = idade;
    }

    //getters

    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}

//subclasse

    class Estudante extends Pessoa {
    private String matricula;

    public Estudante(String nome, int idade, String matricula) {
        //clama o construtor da superclasse (Pessoa)
        super(nome, idade);
        this.matricula = matricula;
    }

        public String getMatricula() {
            return matricula;
        }
    }

    public class exercicioTesteSuper {
        public static void main(String[] args) {
            Estudante estudante = new Estudante("Edi Gain", 23, "202501");

            System.out.println("Nome: " + estudante.getNome());
            System.out.println("Idade: " + estudante.getIdade());
            System.out.println("Matricula: " + estudante.getMatricula());

        }
}