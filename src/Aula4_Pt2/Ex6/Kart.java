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

        System.out.println("Kart " + nome + " está pulando!");
    }

    void soltarturbo(){
        System.out.println("Kart" + nome + " está soltando turbo!");

    }
    void fazerDrift(){
        System.out.println("Kart" + nome + " está fazendo drift!");

    }
}
