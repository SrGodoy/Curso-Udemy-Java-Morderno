public class Bolo {

    int quantidadedeAcucar;

    public static void main (String [] args ){
        Bolo boloDeChocolate = new Bolo();

        boloDeChocolate.quantidadedeAcucar = 200;

        Bolo boloDeBaunilha = new Bolo();

        boloDeBaunilha.quantidadedeAcucar = 150;

        System.out.println("quantidade de açúcar no bolo de chocolate: "
                + boloDeChocolate.quantidadedeAcucar);

        System.out.println("quantidade de açúcar no bolo de baunilha: "
                + boloDeBaunilha.quantidadedeAcucar);
    }
}