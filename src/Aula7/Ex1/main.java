package Aula7.Ex1;

import Aula7.Ex1.br.inatel.cdg.Cliente;
import Aula7.Ex1.br.inatel.cdg.Conta;

public class main {
    public static void main (String[] args){

        Conta c1 = new Conta();

        Cliente cliente = new Cliente();

        cliente.setNome("Enrico");
        cliente.setCpf(123456789);

        c1.setCliente(cliente);
    }
}
