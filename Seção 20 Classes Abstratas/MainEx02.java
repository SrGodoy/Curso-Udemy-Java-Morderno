abstract class Loja {

    protected String cnpj;
    protected String razaoSocial;
    protected boolean aberta;

    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false; // loja inicia fechada

    }

    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("A loja " + razaoSocial + " foi aberta.");
        } else {
            System.out.println("A loja ja esta aberta.");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("A loja " + razaoSocial + " foi fechada.");
        } else {
            System.out.println("A loja já está fechada.");
        }
    }

}
    //Classe concreta lojacomercial
    class LojaComercial extends Loja {

        public LojaComercial(String cnpj, String razaoSocial) {
            super(cnpj, razaoSocial);
        }
    }

public class MainEx02 {
    public static void main(String[] args) {
        LojaComercial minhaLoja = new LojaComercial("12.345.678 0001-99", "Loja do Zé");

        //teste de metodos
        minhaLoja.abrir();
        minhaLoja.fechar();

        minhaLoja.fechar(); //teste para ver se ja esta fechada
    }
}
