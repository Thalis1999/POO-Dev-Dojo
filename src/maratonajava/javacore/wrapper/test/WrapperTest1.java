package src.maratonajava.javacore.wrapper.test;

public class WrapperTest1 {
    static void main() {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10l;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean booleanP = false;

        // Objetos

        Byte byteW = 1;
        Short shortW = 1; // autoboxing - TP para Wrappers
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100.0;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing - Wrapper para TP
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);
    }
}
