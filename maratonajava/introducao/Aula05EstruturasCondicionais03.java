package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        // Operador ternário: (condicao) ?  verdadeiro : falso)
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        boolean possoDoar = salario > 5000;
        System.out.println(resultado);

    }
}
