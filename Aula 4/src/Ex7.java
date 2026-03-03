public class Ex7 {

    public class Conta{
        //Membros da Clase
        int numero;
        String nomeDoDono;
        float saldo;
        float limite;

        //Metodos


    }
    public static void main(String[] args) {

        //Nova instância de Conta
        Conta c = new Conta();
        c.nomeDoDono = "Enrico";
        c.saldo = 5000;

        System.out.println("O dono da classe é: "+ c.nomeDoDono);
    }
}
