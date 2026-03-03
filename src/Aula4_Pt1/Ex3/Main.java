package Aula4_Pt1.Ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        System.out.println("Entre com a vida do zumbi z1: ");
        z1.vida = entrada.nextInt();

        System.out.println("Entre com a vida do zumbi z2: ");
        z2.vida = entrada.nextInt();

        //z1 = z2;

        //System.out.println("Fazendo z1 = z2");

        System.out.println("Vida do zumbi z1: " + z1.mostraVida());
        System.out.println("Vida do zumbi z2: " + z2.mostraVida());

        z1.transfereVida(z2, 15);

        System.out.println("Vida do zumbi z1 após transferência: " + z1.vida);
        System.out.println("Vida do zumbi z2 após transferência: " + z2.vida);

    }

}
