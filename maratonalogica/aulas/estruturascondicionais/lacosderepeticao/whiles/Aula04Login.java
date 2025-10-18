package maratonalogica.aulas.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

/* Solicitar login e senha, se os dois estiverem certo, mensagem ACESSO CONCEDIDO,
se n, ACESSO NEGADO e voltar e repetir ate acertar*/
public class Aula04Login {
    public static void main(String[] args) {

        final String login = "Luffy";
        final String senha = "ReiDosPiratas";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelaLogin) {
            System.out.println("Digite o login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String senhaDigitada = scanner.nextLine();
            if(login.equals(loginDigitado) && senha.equals(senhaDigitada)) {
                System.out.println("Acesso concedido");
                break;
            }
            System.out.println("Acesso negado");
        }
        System.out.println("Programa encerrado");
    }
}
