package javacore.test.testeestatico.dominio;

public class ConversorMoeda {
    public static double TAXA_DOLAR_REAL = 5.25;

    public static double converterDolarParaReal(double valor) {
        return TAXA_DOLAR_REAL * valor;
    }
}
