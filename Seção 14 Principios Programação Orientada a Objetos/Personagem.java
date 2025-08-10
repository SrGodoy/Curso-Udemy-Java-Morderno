public class Personagem {
    String nome;
    int nivelDePoder;

    Personagem(String nome, int nivelDePoder){
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }
    public void tentarAumentarNivelDePoder(int aumentarNivel) {
        nivelDePoder += aumentarNivel;
    }
    public void mudarNome (String novoNome) {
        this.nome = novoNome;
    }

}

    class executar{
        public static void main(String[] args) {
            Personagem homelander = new Personagem("Homelander", 100);
            System.out.println("Heroi: " + homelander.nome + " Nivel : " + homelander.nivelDePoder );

            homelander.tentarAumentarNivelDePoder(20);

            System.out.println("Apos aumentar o Nivel de Poder");
            System.out.println("Heroi: " + homelander.nome + " Nivel : " + homelander.nivelDePoder );

            homelander.mudarNome("Superman");

            System.out.println("Apos mudar o nome ");
            System.out.println("Heroi: " + homelander.nome + " Nivel : " + homelander.nivelDePoder );




        }

    }