package javacore.exception.error.test;

public class StackOverflowtest1 {
    static void main() {
        recursividade();
    }
    static void recursividade() {
        recursividade();
    }
}
