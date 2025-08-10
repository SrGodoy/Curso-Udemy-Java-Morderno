class SalaDeAula {
    static int contagem = 0;

    public SalaDeAula() {
        contagem++;
    }

}
class ExibirContagem {
    public static void mostrar() {
        System.out.println("Número de alunos na chamada : " + Contador.contagem);
    }
}



class ContarAlunos{
    public static void main(String[] args) {
        Contador c1 = new Contador();
        ExibirContagem.mostrar();

        Contador c2 = new Contador();
        ExibirContagem.mostrar();

        Contador c3 = new Contador();
        ExibirContagem.mostrar();

    }
}