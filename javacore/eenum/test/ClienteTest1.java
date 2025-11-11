package javacore.eenum.test;

import javacore.eenum.dominio.Cliente;
import javacore.eenum.dominio.TipoCliente;
import javacore.eenum.dominio.TipoPagamento;

public class ClienteTest1 {
    static void main() {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente2.getNomeRelatorio());
    }
}
