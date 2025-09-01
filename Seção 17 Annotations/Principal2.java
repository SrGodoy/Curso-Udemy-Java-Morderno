class ExemploDepreciado {

    @Deprecated
    public void metodoObsoleto() {
        System.out.println("Este metodo esta obsoleto, mais ainda funciona.");
    }
}

public class Principal2 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ExemploDepreciado exemplo = new ExemploDepreciado();
        exemplo.metodoObsoleto(); //chama metodo obsoleto
    }
}