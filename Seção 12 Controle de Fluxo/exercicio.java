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


            //Exercicio complementar 1: Verificador de mês
            int mes1 = 3;
            String tipoDeMes = switch (mes1) {
                case 1 -> "Janeiro";
                case 2 -> "Fevereiro";
                case 3 -> "Março";
                case 4 -> "Abril";
                case 5 -> "Maio";
                case 6 -> "Junho";
                case 7 -> "Julho";
                case 8 -> "Agosto";
                case 9 -> "Setembro";
                case 10 -> "Outubro";
                case 11 -> "Novembro";
                case 12 -> "Dezembro";
                default -> "Numero errado";
            };
            System.out.println(tipoDeMes);

            //Exercício Complementar 2: Número de Dias no Mês

            String mes2 = "Abril";

            String tipoDeMes2 = switch (mes2) {
                case "Janeiro", "Março", "Maio", "Julho", "Agosto" ,"Outubro", "Dezembro"
                        -> "Meses com 31 dias";
                case "Abril", "Junho", "Setembro", "Novembro" -> "Meses com 30 dias";
                case "Fevereiro" -> "Mes com 28 Dias";
                default -> "Mes Desconhecido";
            };
            System.out.println(tipoDeMes2);

            //Exercício Complementar 3: Verificação de Aprovação Simplificada
            int nota1 = 10;
            int nota2 = 7;
            if (((nota1 + nota2) / 2) >= 6){
                System.out.println("O Aluno esta aprovado");
            }else {
                System.out.println("O Aluno foi reprovado");
            }

            //Exercício Complementar 4: Verificação de Aprovação com Base em Notas e Presença
            int nota11 = 10;
            int nota22 = 8;
            int frequencia = 80;

            if (((nota11 + nota22) / 2) >= 6 && frequencia >= 75){
                System.out.println("O Aluno esta aprovado");
            }else{
                System.out.println("O Aluno foi reprovado");
            }


        }
        }


