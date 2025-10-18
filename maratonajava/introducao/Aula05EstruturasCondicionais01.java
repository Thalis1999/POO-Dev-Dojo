package maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade > 18;
        // !: false
        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado");
        }else {
            System.out.println("Não autorizado");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado");
        }
        boolean c = false;
        if (c = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("fora do if");

    }
}
