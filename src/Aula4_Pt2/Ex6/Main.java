package Aula4_Pt2.Ex6;

public class Main {

    Kart kart1 = new Kart();
    Kart kart2 = new Kart();

    Piloto p1 = new Piloto();
    Piloto p2 = new Piloto();
    p1.nome = "Enrico";
    p2.nome = "Xablesco";

    kart1.piloto = p2;
    kart2.piloto = p1;

}
