package maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double resultado;
        if (salarioAnual <= 34712) {
            resultado = salarioAnual * 9.7/100;
        }else if (salarioAnual >= 34712 && salarioAnual <= 68507){
            resultado = salarioAnual * 37.35/100;
        }else{
            resultado = salarioAnual * 49.50/100;
        }
        System.out.println("Resultado é " + resultado);


    }
}
