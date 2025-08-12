public class ArrayPares {
    public static void main(String[] args) {

        //difine o tamanho do array
        int tamanho = 6;
        int[] meuArray = new int[tamanho];

        meuArray[0] = 2;
        meuArray[1] = 4;
        meuArray[2] = 6;
        meuArray[3] = 8;
        meuArray[4] = 10;
        meuArray[5] = 12;

        //imprimi os array todos na mesma linha
        System.out.println("Elementos do array: ");
        for(int i = 0; i < tamanho; i++) {
            System.out.println(meuArray[i] + " ");
        }
    }
}