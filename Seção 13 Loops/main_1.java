public class main_1 {
    public static void main (String [] args) {

        //for
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("##----------------##");
        //while
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }
        System.out.println("##----------------##");

        //do-while
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);

        System.out.println("##----------------##");

        //Controle de Loop, break

        for (int l = 0; l < 10; l++){
            if (l == 5) {
                break; // Sai do loop quando l é igual a 5
            }
            System.out.println(l);
        }

        System.out.println("##----------------##");

        //Controle de Loop, continue
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                continue; // Pula a iteração quando m é igual a 5
            }
            System.out.println(m);
        }


        }
}