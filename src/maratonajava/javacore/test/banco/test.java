package src.maratonajava.javacore.test.banco;

public class test {
    static void main() {
        ContaBancaria conta1 = new ContaBancaria(500);

        conta1.pagarBoleto(0, 200);
    }
}