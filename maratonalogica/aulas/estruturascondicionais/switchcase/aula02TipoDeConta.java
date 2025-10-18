package maratonalogica.aulas.estruturascondicionais.switchcase;

public class aula02TipoDeConta {
    public static void main(String[] args) {
        String conta = "CONTA_INVESTIMENTO";
        switch (conta) {
            case "CONTA_POUPANCA":
                System.out.println("0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("0.1%");
            break;
            default:
                System.out.println("CONTA INEXISTENTE");
        }
    }
}
