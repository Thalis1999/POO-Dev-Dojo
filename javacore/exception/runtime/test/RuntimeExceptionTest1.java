package javacore.exception.runtime.test;

public class RuntimeExceptionTest1 {
    static void main() {
        // Checked e Unchecked
        Object object = null;
        System.out.println(object.toString());

        // arrayBounds pois nao existe a posicao
        int[] arr = {1,2};
        System.out.println(arr[2]);
    }
}
