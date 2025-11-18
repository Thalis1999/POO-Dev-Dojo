package javacore.test.testeestatico.dominio;

public class Produto {
    public static int contadorTotal = 0;

    public Produto(int contadorTotal) {
        Produto.contadorTotal += contadorTotal;
    }
}
