package javacore.test.testeestatico.test;

import javacore.test.testeestatico.dominio.ConfiguracaoSistema;
import javacore.test.testeestatico.dominio.ConversorMoeda;
import javacore.test.testeestatico.dominio.Produto;

public class main {
    static void main() {
        // Produto
        Produto produto = new Produto(4);
        Produto produto2 = new Produto(6);
        Produto produto3 = new Produto(3);
        System.out.println(Produto.contadorTotal);

        // Conversao
        System.out.println(ConversorMoeda.converterDolarParaReal(45));

        // Sistema
        System.out.println(ConfiguracaoSistema.nomeAplicacao);
        System.out.println(ConfiguracaoSistema.configuracaoCarregada);
    }
}
