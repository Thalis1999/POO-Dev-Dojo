package maratonalogica.aulas.estruturascondicionais.ifelse;

import java.util.Scanner;
/*
    Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadastrassem o nome de usuário (login)
    no sistema para agilizar o processo de migração do sistema antigo para o novo.
    O usuário não pode deixar o login vazio "", ou criar um usuário com o login "admin" ou
    "aministrador". Se o valor entrado for válido, o sistema deverá exibir uma mensagem "<nome do usuário> cadastrado com sucesso"
    Se não o sistema deverá mostrar o erro "Usuário inválido".

    equalsIgnoreCase = Ignora letras maiusculas.
    equals = Comparação de string.
    toBlank() = Para muitos espacos digitados.
    || = Separa condições e se uma for true, true.
*/
public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o login");
        String admin = input.next();
        if (admin.equals("") || admin.equalsIgnoreCase("admin") || admin.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido");
        } else {
            System.out.println(admin + " Cadastrado com sucesso");
        }

    }
}
