public class Ate1000Array {
    public static void main(String[] args) {
        //criação de array 1000 com numeros inteiros
        int[] numeros = new int[1000];

        //preenche o arary com valores de 1 ate 1000 utilizando o for com lenght
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; //i pois começa em 0

        }
        int soma = 0;

        //percorre o array e soma os numeros
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A soma dos numeros de 1 a 1000 é : " + soma);
    }
}