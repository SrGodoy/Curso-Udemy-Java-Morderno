
//classe base
class veiculo {
    void acelerar() {
        System.out.println("Veiculo acelerando !");
    }
}

//subclasse
class  carro extends veiculo {
    @java.lang.Override
    void acelerar() {
        System.out.println("Carro acelerando !");
        //chamando o metodo da superclasse
        super.acelerar();

    }
}

 public class veiculoAcelerar {
     public static void main(String[] args) {
         carro meucarro = new carro();
         meucarro.acelerar();
     }
 }