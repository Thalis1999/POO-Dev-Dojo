package javacore.exception.runtime.test;

public class RuntimeException2 {
    static void main() {
        divisao(1,0);
        System.out.println("Código finalizado.");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) {
        if(b == 0) {
            throw new RuntimeException("Não se divide por 0");
        }
        return a/b;
    }
}
