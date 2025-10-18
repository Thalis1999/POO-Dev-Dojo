package maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // primitive type: int, double, float, char, byte, short, long, boolean
         int idade = 10; //(int) 1000000000L //cast: forçar número muito maior permitido no int
         long numeroGrande = 100000; //(long) 155.25;
         double salarioDouble = 2000.0;
         float salarioFloat = 2500.0F; //(float) 2500.00.
         byte idadeByte = -128;
         short idadeShort = 10;
         boolean verdadeiro = true;
         boolean falso = false;
         char caractere = '\u0041'; //unicode
        String nome = "um grande texto"; //reference type

        System.out.println("A idade é: " + idade + "anos");
        System.out.println(false);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é " + nome);
    }
}
