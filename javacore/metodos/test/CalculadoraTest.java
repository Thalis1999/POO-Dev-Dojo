package javacore.metodos.test;

import javacore.metodos.dominio.Calculadora;

public class CalculadoraTest {
    static void main() {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(4,6);
        calculadora.subtraiDoisNumeros(7,6);
        calculadora.somaVarArgs(4,5,5,8,9);
        System.out.println(calculadora);

    }
}
