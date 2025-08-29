class SuperClasse {
    //Metodo sobreescrito na classe filha (ExercicioMinhaClasse)
    public void imprime () {
        System.out.println("imprime");
    }
}

public class ExercicioMinhaClasse extends SuperClasse {

    @Override
    public void imprime() {
        System.out.println("imprime diferente");
    }

    public static void main(String[] args) {
        ExercicioMinhaClasse obj = new ExercicioMinhaClasse();
        obj.imprime();
    }
}