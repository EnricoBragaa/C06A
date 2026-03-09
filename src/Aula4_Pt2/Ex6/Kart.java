package Aula4_Pt2.Ex6;

public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    public Kart(){
        System.out.print("Executou o construtor da classe Kart");
        motor = new Motor();

    }

    void pular (){
        System.out.println("Pulando...");
    }

    void soltarturbo(){
        System.out.println("Soltando turbo...");

    }
    void fazerDrift(){
        System.out.println("Fazendo drift...");

    }
}
