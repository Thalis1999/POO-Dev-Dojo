package javacore.eenum.test;

import javacore.eenum.dominio.Cliente;
import javacore.eenum.dominio.TipoCliente;

public class ClienteTest1 {
    static void main() {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}
