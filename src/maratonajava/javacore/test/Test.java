package src.maratonajava.javacore.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

enum TipoCliente{
    PJ, PF;
}

class Conta {
    public static final double TAXA_SEGUNDO = 0.01;
    private String titular;
    private int numero;
    private double saldo;
    private LocalDateTime dataAbertura = LocalDateTime.now();
    private LocalDateTime dataUltimaAtualizacao;
    private TipoCliente tipo;
    private boolean contaCriada = false;

    public String status() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm:ss");
        String dataFormatada = this.dataAbertura.format(formatador);
        return "=== Extrato Conta ===\n" +
                "Titular: " + titular + "\n" +
                "Tipo cliente: " + tipo + "\n" +
                "Abertura: " + dataFormatada + "\n" +
                "Status: " + isContaCriada() +
                getSaldo() + "\n" +
                "=====================";
    }

    public Conta(String titular, int numero, double saldo, TipoCliente tipoCliente) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.dataUltimaAtualizacao = this.dataAbertura;
        this.tipo = tipoCliente;
        this.contaCriada = isContaCriada();
    }

    public boolean isContaCriada() {
        return contaCriada = true;
    }

    public void sacar(double retirar) {
        if (retirar <= this.saldo) {
            this.saldo -= retirar;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    public double calcularRendimento() {
        LocalDateTime agora = LocalDateTime.now();
        Long segundosPassados = Duration.between(dataAbertura, agora).toSeconds();
        double rendimento = this.saldo * TAXA_SEGUNDO * segundosPassados;
        return saldo + rendimento;
    }

    public String getSaldo() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");
        return String.format("\nSaldo base: %.2f \nSaldo com rendimento: %.2f",
                this.saldo, calcularRendimento());
    }
}

public class Test {
    static void main() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criar conta?");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Seu CPF: ");
            int numero = scanner.nextInt();
            System.out.println("Deseja depositar algum valor? ");
            String respost = scanner.next();
            double resSaldo = 0;
            if (respost.equalsIgnoreCase("sim")) {
                double saldo = scanner.nextDouble();
                resSaldo = saldo;
            } else{
                System.out.println("Tudo bem. Vamos prossegir.");
            }
            System.out.println("Deseja conta PF ou PJ: ");
            String tipoContaCliente = scanner.next();

            Conta conta = new Conta(nome, numero, resSaldo, TipoCliente.PF);
            System.out.println("Conta Criada. Deseja o extrato?");
            String res = scanner.next();
            if (res.equals("sim")) {
                System.out.println(conta.status());
            }else {
                System.out.println("Obrigado.");
            }
        }else {
            System.out.println("Talvez na próxima vez. Obrigado");
        }
    }
}





