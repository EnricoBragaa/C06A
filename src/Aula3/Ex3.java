package Aula3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor da NPA: ");
        int NPA = entrada.nextInt();

        if (NPA>=60){
            System.out.print("Você está aprovado.");
        }
        else {
            System.out.print("Você não foi aprovado, entre com sua nota da np3.");

            int NP3 = entrada.nextInt();

            float result = (NPA+NP3)/2;

            if (result>=50){
                System.out.print("Você está aprovado.");
            }
            else {
                System.out.print("Você está reprovado.");
            }
        }

    }
}
