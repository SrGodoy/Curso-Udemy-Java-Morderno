import java.util.ArrayList;
import java.util.List;

interface PedidoRestaurante {
    void adcionarItem(String item, double preco);
    double calcularTotal();
}

class Pedido implements PedidoRestaurante {

    private List<String> itens;
    private List<Double> precos;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.precos = new ArrayList<>();
    }

    @java.lang.Override
    public void adcionarItem(String item, double preco) {
        itens.add(item);
        precos.add(preco);
        System.out.println(item + " adcionado ao pedido R$ " + preco);
    }

    @java.lang.Override
    public double calcularTotal() {
        double total = 0.0;
        for (double preco : precos) {
            total += preco;
        }
        return total;
    }
}

    public class Exercicio02Main {
        public static void main(String[] args) {
            Pedido pedido = new Pedido();

            pedido.adcionarItem("Hamburguer", 15.0);
            pedido.adcionarItem("Batata", 7.0);
            pedido.adcionarItem("Sorvete", 8.0);

            System.out.println("--------------------");
            System.out.println("Total do pedido: R$ " + pedido.calcularTotal());
        }
    }
