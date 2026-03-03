import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de lanche1:");
        int lanche1 = entrada.nextInt();
        System.out.print("Entre com o valor de lanche2:");
        int lanche2 = entrada.nextInt();
        System.out.print("Entre com o valor de lanche3:");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        float media = total/3;

        System.out.println("Total de lanches:"+ total);
        System.out.println("Média de lanches:"+ media);

        entrada.close();
    }
}
