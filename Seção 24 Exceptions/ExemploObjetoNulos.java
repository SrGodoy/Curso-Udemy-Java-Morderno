public class ExemploObjetoNulos {
    String test; //inicialização automatica!
    int testPrimitiva;  //inicialização automatica! Neste test sera 0;
    public static void main(String[] args) {

        String nome = new String ("Luccas"); // Variaveis locais devem ser inicializadas (obrigatorio)
        int varLocal = 10;
        System.out.println("Variavel Local "+ varLocal);

        try {
            int tamanhoNome = nome.length(); //Tentando acessar objeto nulo

            System.out.println("Tamanho do nome: " + tamanhoNome);
        }catch (NullPointerException e){
            System.out.println("Erro: A variavel 'nome' esta nula!");
        }finally {
            System.out.println("Sempre execute o bloco finally!");
        }
    }
}