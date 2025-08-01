public class exercicio {
    public static void main(String[] args) {
        //Exercício Loop for: Soma de Valores Acumulados
        int soma = 0;
        while (soma <= 10) {
            System.out.println(soma);
            soma++;
        }
        System.out.println("##----------------##");
        //Exercício Loop while: Contagem de Doces
        int doce = 1;
        while (doce <= 3) {
            System.out.println("Numero de doces comidos " + doce);
            doce++;
        }
        System.out.println("##----------------##");
        //Exercício Complementar 1: Soma de Números Inteiros Positivos
        int valor = 10;

        do {
            System.out.println("O valor é " + valor );
            valor += 10;
        } while  (valor <70);
        System.out.println("Valor final " + valor );

        System.out.println("##----------------##");
        //Exercício Complementar 2: Aplicando 'continue' e 'break'
        int codigoDeSaida = 9;
        for(int codigoCarterinha = 0; codigoCarterinha < 10 ; codigoCarterinha++){

            if (codigoCarterinha == codigoDeSaida) {
                break;
            }
            if (codigoCarterinha == 3 || codigoCarterinha == 7 || codigoCarterinha == 8){
                System.out.println("Codigo de Carterinha Aceito ");
                continue;
            }
            System.out.println("Codigo de Carterinha " + codigoCarterinha);
        }

    }
}