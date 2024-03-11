import java.util.Scanner;

public class FindLogic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last Number");
        int lastN = sc.nextInt();

        int resultA = letterA(lastN);
        int resultB = letterB(lastN);
        int resultC = letterC(lastN);
        int resultD = letterD(lastN);
        int resultE = letterE(lastN);
        

        System.out.println(resultE);



    }

    // SOBRE A LETRA F: É NOTADO QUE TODOS OS NUMEROS COMEÇAM COM A LETRA D, PORTANTO, O PROXIMO NUMERO DEVE SER 200(DUZENTOS);

    private static int letterE(int lastN) {
        int previous =  0;
        int current = 1;
        int next = 0;
        while(next <= lastN){
            next = previous + current;
            previous = current;
            current = next;
        }
        return next;

        //AQUI É UMA APLICACAO DE FIBONACCI, BASICAMENTO PRA DIZER O PROXIMO NUMERO DA SEQUENCIA, DANDO O ULTIMO O NUMERO


    }

    private static int letterD(int lastN) {
        return lastN * lastN;
        // AQUI É PARECIDO COM A LETRA C, ENTRETANTO É RESTRITO AOS NUMEROS PARES; LOGO O PROXIMO NUMERO DEPOIS DE 64, É 100. POIS 10 ^2 = 100;
    }

    private static int letterC(int lastN) {
        return lastN * lastN;
        // AQUI SAO OS NATURAIS ELEVADO AO QUADRADO, LOGO O PROXIMO MUMERO DEVE SER O 49, POIS 7 ^ 2 = 49;
    }

    private static int letterB(int lastN) {
        return 2 * lastN;
        // CADA NUMERO É O DOBRO DO ANTERIOR, LOGO O PROXIMO NUMERO DEPOIS DO 64 E O 128
    }

    private static int letterA(int lastN) {
        return lastN + 2;
        // SÃO OS IMPARES CONSECUTIVOS, LOGO O PROXIMO NUMERO É O PROXIMO IMPAR SUBSEQUENTE
    }




}
