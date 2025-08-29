class InformaRegras {

    @Deprecated // <-- Atenção aqui
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras para Aposentadoria");
    }
    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("NOVAS Regras para Aposentadoria");
    }
}

public class Previdencia {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();

        //Uso do metodo obsoleto (deprecated)
        regras.mostrarRegrasParaAposentadoria();

        //Uso do novo método
        regras.mostrarNovasRegrasParaAposentadoria();
    }
}