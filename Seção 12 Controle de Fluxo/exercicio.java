import java.util.Scanner;


    public class exercicio {
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
            //Verificação de Número Par
            int numero = 10;
            int resto = numero % 2;
            if (resto == 0) {
                System.out.println("O numero = " + numero + " é par");
            }else {
                    System.out.println("O numero = "+ numero + " é impar");
                }
            int nivel;
            System.out.print("Digite um número de 1 a 5: ");
            nivel = sc.nextInt();
            String feedback;
            switch (nivel) {
                case 1:
                    feedback = "Muito insatisfeito";
                    break;
                case 2:
                    feedback = "Insatisfeito";
                    break;
                case 3:
                    feedback = "Neutro";
                    break;
                case 4:
                    feedback = "Satisfeito";
                    break;
                case 5:
                    feedback = "Muito Satisfeito";
                    break;

                default:
                    feedback = "Opção inválida (deve estar entre 1 e 5)";
                    break;
            }
            System.out.println(feedback);

            sc.close();
            }
        }


