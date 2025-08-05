 public class Carro {
     String marcaDoCarro;
     String modeloDoCarro;
     int anoDoCarro;

     Carro(String marca, String modelo) {
         marcaDoCarro = marca;
         modeloDoCarro = modelo;
     }

     Carro(String marca, String modelo, int ano) {
         marcaDoCarro = marca;
         modeloDoCarro = modelo;
         anoDoCarro = ano;
     }

     Carro() {
         marcaDoCarro = "Desconhecida";
         modeloDoCarro = "Desconhecido";
         anoDoCarro = 0;
     }

     public void exibirDetalhes() {
         System.out.println("Marca: " + marcaDoCarro);
         System.out.println("Modelo: " + modeloDoCarro);
         System.out.println("Ano: " + anoDoCarro);
         System.out.println();
     }


     public static void main(String[] args) {

         //contrutor padrão
         Carro carro1 = new Carro();

         //Usando o constructor com marca e modelo
         Carro carro2 = new Carro("Chevrolet", "Camaro");

         //Usando o constructor com marca modelo e ano
         Carro carro3 = new Carro("Honda", "Civic", 2019);

         carro1.exibirDetalhes();
         carro2.exibirDetalhes();
         carro3.exibirDetalhes();

     }

 }

