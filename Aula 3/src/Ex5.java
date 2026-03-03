import java.util.Random;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Random rand = new Random();

        int numGerado, numAdivinhado;

        numGerado = rand.nextInt(10)+1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Adivinhe o número gerado. Entre com um número: ");

        numAdivinhado = entrada.nextInt();

        while(numAdivinhado != numGerado){

            System.out.println("Você errou, tente novamente.");

            numAdivinhado = entrada.nextInt();
        }

        System.out.println("Voce acertou!");
        System.out.println(numGerado);
    }
}
