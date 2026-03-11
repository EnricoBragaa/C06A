package Aula4_Pt2.Ex6;

public class Main {

    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "Kart 1";
        kart2.nome = "Kart 2";

        kart1.motor.cilindradas = "100";
        kart1.motor.velocidadeMaxima = 100f;

        kart2.motor.cilindradas = "150";
        kart2.motor.velocidadeMaxima = 150.0f;

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        p1.nome = "Piloto 1";
        p2.nome = "Piloto 2";

        kart1.piloto = p1;
        kart2.piloto = p2;

        p1.soltaSuperPoder();
        p2.soltaSuperPoder();

        kart1.fazerDrift();
        kart2.motor.mostraInfo();

        kart2.fazerDrift();
        kart2.motor.mostraInfo();


    }

}