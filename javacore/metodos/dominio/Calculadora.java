package javacore.metodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(int a, int b) {
        System.out.println(a + b);
    }

    public void subtraiDoisNumeros(int a, int b){
        System.out.println(a - b);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
