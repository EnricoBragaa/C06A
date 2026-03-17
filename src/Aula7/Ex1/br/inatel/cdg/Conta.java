package Aula7.Ex1.br.inatel.cdg;

public class Conta {

    private int numero;
    private float saldo;
    private float limite;
    Cliente cliente;

    public Conta(){
        System.out.println("Conta foi iniciada");
        cliente = new Cliente();
    }

    public sacar(float quantia){
        if (this.saldo>quantia){
            this.saldo-=quantia;
            System.out.println("Saque realizado");
        } else{
            System.out.println("Saldo insuficiente");
        }

    }

    public deposita(float quantia){
        saldo += quantia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cliente.setNome();


    }
}
